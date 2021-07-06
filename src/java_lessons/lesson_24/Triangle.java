package java_lessons.lesson_24;

public class Triangle extends Figure {

    public Triangle(double a, double b, double c) {

        super(new double[] {a, b, c}, FigureType.TRIANGLE);
    }

    @Override
    public double getArea() {
        double p = super.getPerimeter() / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }
}
