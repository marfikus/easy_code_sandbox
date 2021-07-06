package java_lessons.lesson_24.tasks;

public class WorkerFactory {

    public Worker create(int salary, int experience) {
        if (salary >= Senior.MIN_SALARY
                && experience >= Senior.MIN_EXPERIENCE) {
            return new Senior(salary, experience);
        } else if (salary >= Middle.MIN_SALARY
                && experience >= Middle.MIN_EXPERIENCE) {
            return new Middle(salary, experience);
        } else {
            return new Junior(salary, experience);
        }
    }
}
