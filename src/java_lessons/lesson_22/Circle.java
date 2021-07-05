package java_lessons.lesson_22;

public class Circle extends Figure {
    private final double pi = 3.14;

    public Circle(double radius) {
        super("Circle", new double[] {radius});
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * sides[0];
    }

    @Override
    public double getArea() {
        return pi * sides[0] * sides[0];
    }
}
