package java_lessons.lesson_32.tasks;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Logger {

    private final List<String> list;
    private final TimerCallback callback;
    private final String fileName;
    private final Path file;

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
        callback.stopTimer();
    }

    private void writeToFile() {
        try {
            Files.write(file, list, StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
