package java_lessons.lesson_25.tasks;

public class Main {

    public static void main(String[] args) {

        Worker[] workers = {
                new Designer("Jack"),
                new Developer("Smith"),
                new Tester("Max")
        };

        Task[] tasks = {
                new DesignerTask("button_1 style",
                        "we need style for the button_1...",
                        false),
                new DeveloperTask("button_1 code",
                        "we need action on button_1 click...",
                        false),
                new TesterTask("button_1 test",
                        "we need to check action on button_1 click...",
                        false)
        };


    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
