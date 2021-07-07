package java_lessons.lesson_25.tasks;

public abstract class Task {

    private final String title;
    private final String description;
    private final TaskType type;
    private final boolean isSolved;

    protected Task(String title, String description,
                   TaskType type, boolean isSolved) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.isSolved = isSolved;
    }

    protected Task(Task oldTask, boolean isSolved) {
        this.title = oldTask.title;
        this.description = oldTask.description;
        this.type = oldTask.type;
        this.isSolved = isSolved;
    }

    @Override
    public String toString() {
        return "Task: " + title + ", description: " +
                description + ", type: " + type +
                ", isSolved: " + isSolved;
    }

}
