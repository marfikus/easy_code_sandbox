package java_lessons.lesson_24;

public class Rectangle extends Figure {

    public Rectangle(double a, double b) {
        super(new double[] {a, b}, FigureType.RECTANGLE);
    }

    @Override
    public double getPerimeter() {
        return 2 * super.getPerimeter();
    }

    @Override
    protected double getArea() {
        return sides[0] * sides[1];
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Area: " + getArea();
    }
}
