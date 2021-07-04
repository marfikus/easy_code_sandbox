package java_lessons.lesson_21;

public abstract class Figure {
    protected final double[] sides;

    protected Figure(double[] sides) {
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
