package java_lessons.lesson_22;

public abstract class Figure {
    final String type;
    protected final double[] sides;

    protected Figure(double[] sides) {
        this.type = getType();
        this.sides = sides;
    }

    // при необходимости можно переопределить этот метод у потомков
    protected String getType() {
        return getClass().getSimpleName();
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (double side: sides) {
            perimeter += side;
        }
        return perimeter;
    }

    public abstract double getArea();
}
