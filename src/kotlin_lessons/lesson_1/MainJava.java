package kotlin_lessons.lesson_1;

public class MainJava {

    public static void main(String[] args) {

        log("heading", "body");
        log("heading2");

        print("d", "f", "g");

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
