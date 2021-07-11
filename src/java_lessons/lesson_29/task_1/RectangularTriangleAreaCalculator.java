package java_lessons.lesson_29.task_1;

public class RectangularTriangleAreaCalculator extends AreaCalculator {

    public RectangularTriangleAreaCalculator() {
        super(TriangleType.RECTANGULAR);
    }

    @Override
    public double calcArea(Triangle triangle) {
        double result;
        double sideA = triangle.getSideA();
        double sideB = triangle.getSideB();
        double sideC = triangle.getSideC();

        if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2)) {
            result = 0.5 * sideA * sideB;
        } else if (Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2)) {
            result = 0.5 * sideA * sideC;
        } else {
            result = 0.5 * sideB * sideC;
        }

        return result;
    }
}
