package java_lessons.lesson_25.tasks;

public class DeveloperTask extends Task {

    public DeveloperTask(String title, String description, boolean isSolved) {
        super(title, description, isSolved);
    }

    public DeveloperTask(Task oldTask, boolean isSolved) {
        super(oldTask, isSolved);
    }

}
