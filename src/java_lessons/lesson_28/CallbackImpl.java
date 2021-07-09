package java_lessons.lesson_28;

public class CallbackImpl implements TaskProgressCallback {

    private final TaskFactory taskFactory;

    public CallbackImpl(TaskFactory taskFactory) {
        this.taskFactory = taskFactory;
    }

    @Override
    public void updateTask(Task task) {
        taskFactory.updateTask(task);
    }
}
