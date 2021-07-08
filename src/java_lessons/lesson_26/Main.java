package java_lessons.lesson_26;

public class Main {

    public static void main(String[] args) {

        TaskFactory factory = new TaskFactory();
        TaskProgressCallback callback = new TaskProgressCallback() {
            @Override
            public void updateTask(Task task) {
                factory.updateTask(task);
            }
        };

        EmployeeChain chain = new EmployeeChain(new Designer(callback, "Alice"));
        EmployeeChain next = new EmployeeChain(new Programmer(callback, "Nick"));
        EmployeeChain last = new EmployeeChain(new Tester(callback, "Jack"));
        next.setNextEmployeeChain(last);
        chain.setNextEmployeeChain(next);

        while (true)
            chain.doTask(factory.getTask());

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
