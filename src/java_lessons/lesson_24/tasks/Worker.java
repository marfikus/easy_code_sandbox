package java_lessons.lesson_24.tasks;

public abstract class Worker {
    private final int salary;
    private final int experience;
    private final WorkerType type;

    protected Worker(int salary, int experience, WorkerType type) {
        this.salary = salary;
        this.experience = experience;
        this.type = type;
    }

    public WorkerType getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " worker, experience: " + experience
                + ", salary: " + salary;
    }
}
