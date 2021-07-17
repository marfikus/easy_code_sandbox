package kotlin_lessons.lesson_2;

public class Singleton {

    private static Singleton sSingleton;

    public static Singleton getInstance() {
        if (sSingleton == null) {
            sSingleton = new Singleton();
        }
        return sSingleton;
    }

    private Singleton() {
        System.out.println("constructor called");
    }
}
