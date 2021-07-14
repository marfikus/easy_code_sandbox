package java_lessons.lesson_31.tasks;

import java.util.Date;

public class Main {

    private static final String URL = "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1920_18MG.mp4";
    private static final String FILE_NAME = "downloads/someVideo.mp4";

    public static void main(String[] args) {

        print("Starting at " + new Date());

        Thread[] threads = new Thread[4];

        for (int i = 0; i < threads.length; i++) {
            int number = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    new DownloadFile(URL, "downloads/someVideo_" + number + ".mp4").start(2);
                }
            });
        }

        for (Thread thread : threads) {
            thread.start();
            print("Thread started");
        }

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
