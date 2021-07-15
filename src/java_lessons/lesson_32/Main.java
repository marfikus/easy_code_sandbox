package java_lessons.lesson_32;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    private static final String URL = "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1920_18MG.mp4";
    private static final String FILE_NAME = "downloads/someVideo.mp4";

    public static void main(String[] args) {

        print("Starting main thread at " + new Date());
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            threads.add(new Thread(new DownloadFile(URL, "downloads/" + i + "_video.mp4", i)));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        print("Finishing main thread at " + new Date());

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
