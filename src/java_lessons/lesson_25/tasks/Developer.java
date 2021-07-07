package java_lessons.lesson_25.tasks;

public class Developer extends Worker {

    public Developer(String name) {
        super(name, WorkerType.DEVELOPER);
    }

    @Override
    public void work() {
        currentTask = new DeveloperTask(currentTask, true);
        System.out.println("task solved!");
    }
}
