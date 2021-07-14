package java_lessons.lesson_31.tasks.add_callback;

import java.util.Date;
import java.util.Scanner;

public class Main {

    private static final String URL = "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1920_18MG.mp4";
    private static final String FILE_NAME = "downloads/someVideo.mp4";

    public static void main(String[] args) {

        print("Starting at " + new Date());

        UserInputCallback callback = new UserInputCallback() {
            @Override
            public String requestToUser() {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextLine();
            }
        };

        new DownloadFile(URL, FILE_NAME, callback).start(3);
        print("Finishing at " + new Date());

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
