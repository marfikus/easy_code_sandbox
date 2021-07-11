package java_lessons.lesson_29.task_1;

public abstract class AreaCalculator {

    private final Triangle triangle;
    protected final TriangleType triangleType;

    protected AreaCalculator(Triangle triangle) {
        this.triangle = triangle;
        this.triangleType = getTriangleType(triangle);
    }

    private TriangleType getTriangleType(Triangle triangle) {
        // TODO: 11.07.2021 определяем тип треугольника
    }

    public abstract double calcArea();

}
