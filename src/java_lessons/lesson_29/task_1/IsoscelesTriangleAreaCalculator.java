package java_lessons.lesson_29.task_1;

public class IsoscelesTriangleAreaCalculator extends AreaCalculator {

    public IsoscelesTriangleAreaCalculator() {
        super(TriangleType.ISOSCELES);
    }

    @Override
    public double calcArea(Triangle triangle) {
        double h;
        double result;
        double sideA = triangle.getSideA();
        double sideB = triangle.getSideB();
        double sideC = triangle.getSideC();

        if (sideA == sideB) {
            h = Math.sqrt(Math.pow(sideA, 2) - Math.pow((0.5 * sideC), 2));
            result = 0.5 * sideC * h;
        } else if (sideA == sideC) {
            h = Math.sqrt(Math.pow(sideC, 2) - Math.pow((0.5 * sideB), 2));
            result = 0.5 * sideB * h;
        } else {
            h = Math.sqrt(Math.pow(sideB, 2) - Math.pow((0.5 * sideA), 2));
            result = 0.5 * sideA * h;
        }

        return result;
    }
}
