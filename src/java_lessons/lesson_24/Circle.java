package java_lessons.lesson_24;

public class Circle extends Figure {
    private final double pi = 3.14;

    public Circle(double radius) {

        super(new double[] {radius}, FigureType.CIRCLE);
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
