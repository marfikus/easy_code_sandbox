package java_lessons.lesson_25.tasks;

public class DeveloperTask extends Task {

    public DeveloperTask(String title, String description, boolean status) {
        super(title, description, status);
    }

    public DeveloperTask(Task oldTask, boolean status) {
        super(oldTask, status);
    }

}
