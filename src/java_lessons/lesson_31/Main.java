package java_lessons.lesson_31;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static final String URL = "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1920_18MG.mp4";

    public static void main(String[] args) {

        print("Starting at " + new Date());
        downloadFile();
        print("Finishing at " + new Date());

    }

    private static void downloadFile() {
        print("Starting downloading file");
        try (BufferedInputStream in = new BufferedInputStream(new URL(URL).openStream());
        FileOutputStream fileOutputStream = new FileOutputStream("downloads/someVideo.mp4")) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, dataBuffer.length)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            print("Something went wrong, try again? y/n");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                downloadFile();
            }
        }
    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
