package java_lessons.lesson_24.tasks;

public class Senior extends Worker {
    public static final int MIN_SALARY = 15000;
    public static final int MIN_EXPERIENCE = 3;

    public Senior(int salary, int experience) {
        super(salary, experience, WorkerType.SENIOR);
    }
}
