package java_lessons.lesson_26;

public class Main {

    public static void main(String[] args) {

        TaskFactory factory = new TaskFactory();
        CallbackImpl callback = new CallbackImpl(factory);

        EmployeeChain chain = new EmployeeChain(
                new EmployeeChain(
                        new Designer(callback, "Alice"),
                        new Programmer(callback, "Nick")
                ),
                new Tester(callback, "Jack")
        );

        while (true)
            if (!chain.doTask(factory.getTask())) {
                break;
            }

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
