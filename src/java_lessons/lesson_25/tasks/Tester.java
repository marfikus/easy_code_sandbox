package java_lessons.lesson_25.tasks;

public class Tester extends Worker {

    public Tester(String name, WorkerType type) {
        super(name, type);
    }

    @Override
    public void work() {
        currentTask = new TesterTask(currentTask, true);
        System.out.println("task solved!");
    }
}
