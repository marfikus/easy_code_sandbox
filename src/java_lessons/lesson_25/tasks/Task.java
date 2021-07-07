package java_lessons.lesson_25.tasks;

public abstract class Task {

    private final String title;
    private final String description;
    private final boolean status;

    protected Task(String title, String description, boolean status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    protected Task(Task oldTask, boolean status) {
        this.title = oldTask.title;
        this.description = oldTask.description;
        this.status = status;
    }

}
