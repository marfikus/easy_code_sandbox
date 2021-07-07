package java_lessons.lesson_25.tasks;

public class Designer extends Worker {

    public Designer(String name, WorkerType type) {
        super(name, type);
    }

    @Override
    public void work() {
        currentTask = new DesignerTask(currentTask, true);
        System.out.println("task solved!");
    }
}
