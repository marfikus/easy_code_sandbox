package java_lessons.lesson_22;

public abstract class Figure {
    final String type;
    protected final double[] sides;

    protected Figure(double[] sides) {
        this.type = this.getClass().getSimpleName();
        this.sides = sides;
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
