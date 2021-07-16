package java_lessons.lesson_32.tasks;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Logger {

    private final List<String> list;
    private final TimerCallback callback;
    private final String fileName;
    private final Path file;

    final int MAX_LINES_IN_FILE = 100;

    public Logger(List<String> list, TimerCallback callback, String fileName) {
        this.list = list;
        this.callback = callback;
        this.fileName = fileName;
        this.file = Paths.get(fileName);
    }

    public synchronized void addLog(String header, String body) {
        list.add("--------");
        list.add("Log with header: " + header);
        list.add("Log with body: " + body);
    }

    public void print() {
        for (String string : list) {
            System.out.println(string);
        }
        writeToFile();
        list.clear();
        callback.stopTimer();
    }

    private void writeToFile() {
        try {
            if (Files.exists(file)) {
                List<String> fileLines = Files.readAllLines(file, StandardCharsets.UTF_8);
                int numLinesForDelete = (fileLines.size() + list.size()) - MAX_LINES_IN_FILE;

                if (numLinesForDelete > 0) {
                    List<String> newList = fileLines.subList(numLinesForDelete, fileLines.size());
                    newList.addAll(list);
//                    System.out.println("rewrite file");
                    Files.write(file, newList, StandardCharsets.UTF_8);
                } else {
//                    System.out.println("add lines to file");
                    Files.write(file, list, StandardCharsets.UTF_8,
                            StandardOpenOption.APPEND);
                }
            } else {
//                System.out.println("create file");
                Files.write(file, list, StandardCharsets.UTF_8);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
