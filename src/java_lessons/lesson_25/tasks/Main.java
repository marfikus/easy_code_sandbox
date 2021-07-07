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

        workers[0].setTask(tasks[0]);
        print(workers[0].getCurrentTask().toString());
        workers[0].work();
        print(workers[0].getCurrentTask().toString());

        workers[1].setTask(tasks[1]);
        workers[1].work();

        workers[2].setTask(tasks[2]);
        workers[2].work();

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
