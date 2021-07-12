package java_lessons.lesson_29.task_2;

public class PasswordCheckerMinLength extends PasswordChecker {

    final int MIN_LENGTH = 10;

    @Override
    public boolean isValid(String password) {
        if (password.length() >= MIN_LENGTH) {
            return true;
        } else {
            throw new RuntimeException("Password is short!");
        }
    }
}
