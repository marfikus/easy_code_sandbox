package java_lessons.lesson_29.task_2;

public class PasswordCheckerMinLength extends PasswordChecker {

    final int MIN_LENGTH = 10;

    @Override
    public boolean isValid(String password) {
        return password.length() >= MIN_LENGTH;
    }
}
