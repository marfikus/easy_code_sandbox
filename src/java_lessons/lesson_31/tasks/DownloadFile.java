package java_lessons.lesson_31.tasks;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

public class DownloadFile {

    private final String url;
    private final String fileName;

    public DownloadFile(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
    }

    public void start(int attempts) {
        System.out.println("Starting downloading file at " + new Date());
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, dataBuffer.length)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
            System.out.println("Finishing downloading file at " + new Date());
        } catch (IOException e) {
            if (attempts > 1) {
                start(--attempts);
            } else {
                System.out.println("Downloading file failed at " + new Date());
            }
        }
    }
}
