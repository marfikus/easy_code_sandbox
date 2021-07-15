package java_lessons.lesson_31.tasks.file_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    private static final String FILE_PATH = "downloads/";
    private static final String FILE_NAME = "someVideo.mp4";

    public static void main(String[] args) {

        copyFile(FILE_NAME);

    }

    private static void copyFile(String fileName) {
        try ( FileInputStream inputStream = new FileInputStream(FILE_PATH + fileName);
             FileOutputStream outputStream = new FileOutputStream(FILE_PATH
                     + "copyOf_" + fileName) ) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ( (bytesRead = inputStream.read(buffer, 0, buffer.length)) != -1 ) {
                outputStream.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
