package java_lessons.lesson_21;

public class Rectangle extends Figure {

    public Rectangle(double a, double b) {
        super(new double[] {a, b});
    }

    @Override
    public double getPerimeter() {
        return 2 * super.getPerimeter();
    }

    @Override
    public double getArea() {
        return sides[0] * sides[1];
    }
}
