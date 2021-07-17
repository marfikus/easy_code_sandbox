package kotlin_lessons.lesson_2;

public class JavaClass {

    private int i;

    public JavaClass() {
        System.out.println("constructor called");
    }

    {
        System.out.println("some code...");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
