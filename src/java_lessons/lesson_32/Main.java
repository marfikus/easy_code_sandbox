package java_lessons.lesson_32;

public class Main {

    private static final String URL = "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1920_18MG.mp4";
    private static final String FILE_NAME = "downloads/someVideo.mp4";

    public static void main(String[] args) {

//        print("Starting at " + new Date());
        Thread downloadThread = new Thread(new Runnable() {
            @Override
            public void run() {
                new DownloadFile(URL, FILE_NAME).start(2);
            }
        });
        downloadThread.start();
//        print("Finishing at " + new Date());

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
