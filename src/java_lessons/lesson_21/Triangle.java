package java_lessons.lesson_21;

public class Triangle extends Figure {

    public Triangle(double a, double b, double c) {
        super("Triangle", new double[] {a, b, c});
    }

    @Override
    public double getArea() {
        double p = super.getPerimeter() / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }
}
