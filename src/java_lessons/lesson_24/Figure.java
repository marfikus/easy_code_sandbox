package java_lessons.lesson_24;

public abstract class Figure {
    private final FigureType type;
    protected final double[] sides;

    protected Figure(double[] sides, FigureType type) {
        this.type = type;
        this.sides = sides;
    }

    public FigureType getType() {
        return type;
    }

    protected double getPerimeter() {
        double perimeter = 0;
        for (double side: sides) {
            perimeter += side;
        }
        return perimeter;
    }

    protected abstract double getArea();

    @Override
    public String toString() {
        return "Type: " + getType() + ", Area: " + getArea()
                + ", Perimeter: " + getPerimeter();
    }
}
