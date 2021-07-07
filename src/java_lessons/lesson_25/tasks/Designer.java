package java_lessons.lesson_25.tasks;

public class Designer extends Worker {

    public Designer(String name) {
        super(name, WorkerType.DESIGNER);
    }

    @Override
    public void work() {
        currentTask = new DesignerTask(currentTask, true);
        System.out.println("task solved!");
    }
}
