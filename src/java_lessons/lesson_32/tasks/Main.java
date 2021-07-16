package java_lessons.lesson_32.tasks;

import java.util.*;

public class Main {

    private static final String URL = "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1920_18MG.mp4";
    private static final String FILE_NAME = "downloads/someVideo.mp4";

    public static void main(String[] args) {

        print("Starting main thread at " + new Date());

        List<Thread> threads = new ArrayList<>();
        Timer timer = new Timer();
        TimerCallbackImpl callback = new TimerCallbackImpl(timer);
        Logger logger = new Logger(new ArrayList<>(), callback, "downloads/log.txt");

        for (int i = 0; i < 3; i++) {
//            threads.add(new DownloadFile(URL, "downloads/" + i + "_video.mp4", i));

            int finalI = i;
            threads.add(new Thread(() ->
                    logger.addLog("Header " + finalI, "body " + finalI)));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                logger.print();
            }
        };
        timer.schedule(task, 2000);

        print("Finishing main thread at " + new Date());
    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
