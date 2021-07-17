package kotlin_lessons.lesson_2;

public class JavaSingleton {

    private static JavaSingleton sSingleton;

    public static JavaSingleton getInstance() {
        if (sSingleton == null) {
            sSingleton = new JavaSingleton();
        }
        return sSingleton;
    }

    private JavaSingleton() {
        System.out.println("constructor called");
    }
}
