package java_lessons.lesson_25.tasks;

public class Tester extends Worker {

    public Tester(String name) {
        super(name, WorkerType.TESTER);
    }

    @Override
    public void work() {
        currentTask = new TesterTask(currentTask, true);
        System.out.println("task solved!");
    }
}
