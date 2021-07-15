package java_lessons.lesson_32.tasks;

import java.util.List;

public class Logger {

    private final List<String> list;
    private final TimerCallback callback;

    public Logger(List<String> list, TimerCallback callback) {
        this.list = list;
        this.callback = callback;
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
        callback.stopTimer();
    }
}
