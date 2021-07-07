package java_lessons.lesson_25.tasks;

public abstract class Worker {
    private final String name;
    private final WorkerType type;

    protected Task currentTask;

    protected Worker(String name, WorkerType type) {
        this.name = name;
        this.type = type;
    }

    public void setTask(Task task) {
        currentTask = task;
    }

    public abstract void work();

    public Task getCurrentTask() {
        return currentTask;
    }

}
