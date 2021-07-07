package java_lessons.lesson_25.tasks;

public class Developer extends Worker {

    public Developer(String name) {
        super(name, WorkerType.DEVELOPER);
    }

    @Override
    public void work() {
        Task currentTask = getCurrentTask();
        if (currentTask != null) {
            currentTask = new DeveloperTask(currentTask, true);
            setTask(currentTask);
            System.out.println("task solved!");
        } else {
            System.out.println("no task!");
        }
    }
}
