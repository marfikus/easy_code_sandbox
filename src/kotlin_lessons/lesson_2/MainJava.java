package kotlin_lessons.lesson_2;

public class MainJava {

    public static void main(String[] args) {

        JavaSingleton singleton = JavaSingleton.getInstance();
        singleton = JavaSingleton.getInstance();

    }
}
