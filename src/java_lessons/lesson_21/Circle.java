package java_lessons.lesson_21;

public class Circle {
    private final double radius;
    private final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * pi * radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }
}
