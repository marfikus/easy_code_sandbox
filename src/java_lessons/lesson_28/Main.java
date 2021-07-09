package java_lessons.lesson_28;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TaskFactory factory = new TaskFactory();
        CallbackImpl callback = new CallbackImpl(factory);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Designer(callback, "Alice"));

        employees.add(new Programmer(callback, "Nick"));
        // simulating a developer pause
/*        employees.add(new Programmer(new TaskProgressCallback() {
            @Override
            public void updateTask(Task oldTask, Task newTask) {
                print("Programmer update task");
            }
        }, "Nick"));*/

        employees.add(new Tester(callback, "Jack"));

        factory.addEmployees(employees);
        factory.start();

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
