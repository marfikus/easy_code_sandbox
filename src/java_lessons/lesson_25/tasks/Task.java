package java_lessons.lesson_25.tasks;

public abstract class Task {

    private final String title;
    private final String description;
    private final boolean isSolved;

    protected Task(String title, String description, boolean isSolved) {
        this.title = title;
        this.description = description;
        this.isSolved = isSolved;
    }

    protected Task(Task oldTask, boolean isSolved) {
        this.title = oldTask.title;
        this.description = oldTask.description;
        this.isSolved = isSolved;
    }

}
