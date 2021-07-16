package kotlin_lessons.lesson_1;

import java.util.ArrayList;
import java.util.List;

public class MainJava {

    public static void main(String[] args) {

        log("heading", "body");
        log("heading2");
        print("d", "f", "g");

        List<String> l = singletonList("dd");
        List<Integer> l2 = singletonList(33);

        print2("test string", Integer.MAX_VALUE / 1000);

    }

    private static void print2(String str, int times) {
        if (times == 0) {
            System.out.println("finished");
        } else {
            System.out.println(str + times);
            print2(str, --times);
        }
    }

    public static <T> List<T> singletonList(T obj) {
        List<T> list = new ArrayList<>(1);
        list.add(obj);
        return list;
    }

    public static void print(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void log(String heading, String body) {
        if (!heading.isEmpty()) {
            System.out.println(heading);
        }

        if (!body.isEmpty()) {
            System.out.println(body);
        }
    }

    public static void log(String heading) {
        log(heading, "");
    }

}
