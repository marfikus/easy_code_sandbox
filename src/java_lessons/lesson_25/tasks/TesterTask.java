package java_lessons.lesson_25.tasks;

public class TesterTask extends Task {

    protected TesterTask(String title, String description, boolean status) {
        super(title, description, status);
    }

    protected TesterTask(Task oldTask, boolean status) {
        super(oldTask, status);
    }
}
