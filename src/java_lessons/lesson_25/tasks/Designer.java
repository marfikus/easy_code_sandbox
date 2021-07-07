package java_lessons.lesson_25.tasks;

public class Designer extends Worker {

    public Designer(String name) {
        super(name, WorkerType.DESIGNER);
    }

    @Override
    public void work() {
        Task currentTask = getCurrentTask();
        if (currentTask != null) {
            currentTask = new DesignerTask(currentTask, true);
            setTask(currentTask);
            System.out.println("task solved!");
        } else {
            System.out.println("no task!");
        }
    }
}
