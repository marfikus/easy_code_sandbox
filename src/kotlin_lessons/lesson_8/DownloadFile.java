package kotlin_lessons.lesson_8;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

public class DownloadFile extends Thread {

    private final String url;
    private final String fileName;
    private final ProgressCallback callback;

    public DownloadFile(String url, String fileName, ProgressCallback callback) {
        this.url = url;
        this.fileName = fileName;
        this.callback = callback;
    }

    @Override
    public void run() {
//        System.out.println(new Date() + " starting " + id);
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, dataBuffer.length)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
//            System.out.println(new Date() + " finished " + id);
            callback.finishedSuccessfully();
        } catch (IOException e) {
//            System.out.println(new Date() + " failed " + id);
            callback.failed(e.getMessage());
        }
    }

    interface ProgressCallback {

        void failed(String message);

        void finishedSuccessfully();
    }

}
