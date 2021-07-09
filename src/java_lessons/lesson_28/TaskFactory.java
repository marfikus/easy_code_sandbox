package java_lessons.lesson_28;

import java.util.ArrayList;
import java.util.List;

public class TaskFactory {

    private static final int SIZE = 10;
    private final Task[] tasks;
    private final List<Column> columns;

    public TaskFactory() {
        tasks = new Task[SIZE];
        for (int i = 0; i < SIZE; i++) {
            tasks[i] = new Task(i, Task.Status.ASSEMBLING_REQUIREMENT,
                    "description_" + i, "", "", "");
        }

        columns = new ArrayList<>();
        columns.add(new Column(Task.Status.ASSEMBLING_REQUIREMENT));
        columns.add(new Column(Task.Status.READY_TO_DO));
        columns.add(new Column(Task.Status.READY_FOR_TESTING));
        columns.add(new Column(Task.Status.DONE));
    }

    public void addEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            for (Column column : columns) {
                if (employee.canBeObserverForColumn(column)) {
                    column.registerObserver(employee);
                }
            }
        }
    }

    public void updateTask(Task oldTask, Task newTask) {
        for (Column column : columns) {
            if (column.contains(oldTask.getStatus())) {
                column.removeTask(oldTask);
            }
            if (column.contains(newTask.getStatus())) {
                column.addTask(newTask);
            }
        }
    }

    public void start() {
        for (Task task : tasks) {
            columns.get(0).addTask(task);
        }
    }
}
