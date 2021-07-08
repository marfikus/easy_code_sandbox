package java_lessons.lesson_26;

public class EmployeeChain implements TaskHandler {

    private final TaskHandler first;
    private final TaskHandler second;

    public EmployeeChain(TaskHandler first, TaskHandler second) {
        this.first = first;
        this.second = second;
    }

    public boolean doTask(Task task) {
        boolean result;

        result = first.doTask(task);
        if (!result) {
            result = second.doTask(task);
        }
        return result;
    }

}
