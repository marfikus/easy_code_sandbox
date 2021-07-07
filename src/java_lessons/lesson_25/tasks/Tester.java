package java_lessons.lesson_25.tasks;

public class Tester extends Worker {

    public Tester(String name) {
        super(name, WorkerType.TESTER);
    }

    @Override
    public void work() {
        Task currentTask = getCurrentTask();
        if (currentTask != null) {
            currentTask = new TesterTask(currentTask, true);
            setTask(currentTask);
            System.out.println("task solved!");
        } else {
            System.out.println("no task!");
        }
    }
}
