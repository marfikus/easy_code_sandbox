package java_lessons.lesson_25.tasks;

public class TesterTask extends Task {

    protected TesterTask(String title, String description, boolean isSolved) {
        super(title, description, TaskType.TESTER, isSolved);
    }

    protected TesterTask(Task oldTask, boolean isSolved) {
        super(oldTask, isSolved);
    }
}
