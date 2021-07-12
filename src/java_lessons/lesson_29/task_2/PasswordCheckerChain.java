package java_lessons.lesson_29.task_2;

public class PasswordCheckerChain implements PasswordCheckerHandler {

    private final PasswordCheckerHandler checker;
    private final PasswordCheckerHandler nextChecker;

    public PasswordCheckerChain(PasswordCheckerHandler checker,
                                PasswordCheckerHandler nextChecker) {
        this.checker = checker;
        this.nextChecker = nextChecker;
    }

    @Override
    public boolean isValid(String password) {
        checker.isValid(password);
        nextChecker.isValid(password);
        return true;
    }
}
