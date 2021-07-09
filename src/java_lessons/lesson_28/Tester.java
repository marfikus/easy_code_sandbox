package java_lessons.lesson_28;

public class Tester extends Employee {

    protected Tester(TaskProgressCallback callback, String name) {
        super(callback, name, Task.Status.READY_FOR_TESTING);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.DONE,
                task.getDescription(),
                task.getDesignLink(),
                task.getTestcase(),
                task.getBuildLink()
        );
    }

    @Override
    protected String getDetails(Task task) {
        return "with id: " + task.getId() + " and testcase " + task.getTestcase();
    }
}
