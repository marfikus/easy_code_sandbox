package java_lessons.lesson_29.task_2;

public class Main {

    public static void main(String[] args) {

        String password = "df843jgr9fj43j3";

        PasswordCheckerChain chain = new PasswordCheckerChain(
                new PasswordCheckerEmpty(),
                new PasswordCheckerChain(
                        new PasswordCheckerMinLength(),
                        new PasswordCheckerContainsOneDigit()
                )
        );

        print(chain.isValid(password));

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
