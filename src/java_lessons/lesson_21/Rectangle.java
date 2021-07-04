package java_lessons.lesson_21;

public class Rectangle {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter() {
        return 2 * a + 2 * b;
    }

    public double getArea() {
        return a * b;
    }
}
