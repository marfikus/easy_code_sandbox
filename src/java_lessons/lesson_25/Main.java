package java_lessons.lesson_25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Main {

    public static void main(String[] args) {

        MyData data = getMyData();
        print(data.toString());

    }

    @NotNull
    private static MyData getMyData() {
        return new MyData(1, "dd");
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static void print(int text) {
        System.out.println(text);
    }
}
