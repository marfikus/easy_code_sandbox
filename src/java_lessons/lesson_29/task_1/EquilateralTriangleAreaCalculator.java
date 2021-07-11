package java_lessons.lesson_29.task_1;

public class EquilateralTriangleAreaCalculator extends AreaCalculator{

    protected EquilateralTriangleAreaCalculator() {
        super(TriangleType.EQUILATERAL);
    }

    @Override
    public double calcArea(Triangle triangle) {
        return (Math.pow(triangle.getSideA(), 2) * Math.sqrt(3)) / 4;
    }
}
