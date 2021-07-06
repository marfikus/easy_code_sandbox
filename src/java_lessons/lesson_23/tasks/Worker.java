package java_lessons.lesson_23.tasks;

public abstract class Worker {
    private final int salary;
    private final int experience;

    protected Worker(int salary, int experience) {
        this.salary = salary;
        this.experience = experience;
    }
}
