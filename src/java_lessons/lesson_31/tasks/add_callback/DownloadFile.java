package java_lessons.lesson_31.tasks.add_callback;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class DownloadFile {

    private final String url;
    private final String fileName;
    private final UserInputCallback callback;

    public DownloadFile(String url, String fileName, UserInputCallback callback) {
        this.url = url;
        this.fileName = fileName;
        this.callback = callback;
    }

    public void start(int attempts) {
        System.out.println("Starting downloading file");
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, dataBuffer.length)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            if (attempts > 1) {
                start(--attempts);
            } else {
                System.out.println("Download attempts is over, repeat one more time? y/n");
                String answer = callback.requestToUser();
                if (answer.equalsIgnoreCase("y")) {
                    start(1);
                } else {
                    System.out.println("Downloading file failed!");
                }
            }
        }
    }
}
