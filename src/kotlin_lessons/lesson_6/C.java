package kotlin_lessons.lesson_6;

public class C implements A, B {

    private final A a;
    private final B b;

    public C(A a, B b) {
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

    @Override
    public void doThree() {
        b.doThree();
    }
}
