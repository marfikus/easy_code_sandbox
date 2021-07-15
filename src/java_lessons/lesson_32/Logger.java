package java_lessons.lesson_32;

import java.util.List;

public class Logger {

    private final List<String> list;

    public Logger(List<String> list) {
        this.list = list;
    }

    public void addLog(String header, String body) {
        list.add("--------");
        list.add("Log with header: " + header);
        list.add("Log with body: " + body);
    }

    public void print() {
        for (String string : list) {
            System.out.println(string);
        }
    }
}
