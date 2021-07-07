package java_lessons.lesson_25.tasks;

public class DesignerTask extends Task {

    public DesignerTask(String title, String description, boolean status) {
        super(title, description, status);
    }

    public DesignerTask(Task oldTask, boolean status) {
        super(oldTask, status);
    }
}
