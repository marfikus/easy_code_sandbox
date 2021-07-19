package kotlin_lessons.lesson_6;

import org.jetbrains.annotations.NotNull;

public class CJava implements A, B {

    private final A a;
    private final B b;

    public CJava(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void doOne() {
        a.doOne();
    }

    @Override
    public void doTwo() {
        a.doTwo();
    }

/*    @Override
    public void doThree() {
        b.doThree();
    }*/

    @NotNull
    @Override
    public String getData() {
        return null;
    }
}
