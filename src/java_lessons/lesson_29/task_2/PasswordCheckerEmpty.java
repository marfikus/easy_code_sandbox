package java_lessons.lesson_29.task_2;

public class PasswordCheckerEmpty extends PasswordChecker {

    @Override
    public boolean isValid(String password) {
        if (!password.isEmpty()) {
            return true;
        } else {
            throw new RuntimeException("Password is empty!");
        }
    }
}
