package java_lessons.lesson_25.tasks;

public abstract class Worker {
    private final String name;
    private final WorkerType type;

    protected Worker(String name, WorkerType type) {
        this.name = name;
        this.type = type;
    }

    public abstract void work();
}
