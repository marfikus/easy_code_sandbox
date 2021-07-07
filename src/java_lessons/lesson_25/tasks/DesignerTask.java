package java_lessons.lesson_25.tasks;

public class DesignerTask extends Task {

    public DesignerTask(String title, String description, boolean isSolved) {
        super(title, description, TaskType.DESIGNER, isSolved);
    }

    public DesignerTask(Task oldTask, boolean isSolved) {
        super(oldTask, isSolved);
    }
}
