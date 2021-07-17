package kotlin_lessons.lesson_2;

public class MainJava {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton = Singleton.getInstance();

    }
}
