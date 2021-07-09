package java_lessons.lesson_28;

import org.jetbrains.annotations.NotNull;

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

    @NotNull
    public Task getTask() {
        Task result = null;
        for (Task task : tasks) {
            if (task.getStatus() != Task.Status.DONE) {
                result = task;
                break;
            }
        }

        if (result == null) {
            result = tasks[0];
        }

        return result;
    }

    public void updateTask(Task task) {
        for (int i = 0; i < SIZE; i ++) {
            if (tasks[i].getId() == task.getId()) {
                tasks[i] = task;
                break;
            }
        }
    }
}
