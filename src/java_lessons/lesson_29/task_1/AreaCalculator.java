package java_lessons.lesson_29.task_1;

public abstract class AreaCalculator implements AreaCalcHandler {

    protected final TriangleType calculatorType;

    protected AreaCalculator(TriangleType calculatorType) {
        this.calculatorType = calculatorType;
    }

    private TriangleType getTriangleType(Triangle triangle) {
        TriangleType result;
        double sideA = triangle.getSideA();
        double sideB = triangle.getSideB();
        double sideC = triangle.getSideC();

        if (sideA == sideB && sideA == sideC) {
            result = TriangleType.EQUILATERAL;

        } else if ((sideA == sideB && sideA != sideC)
                || (sideA == sideC && sideA != sideB)
                || (sideB == sideC && sideB != sideA)) {
            result = TriangleType.ISOSCELES;

        } else if ((Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2))
                    || (Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2))
                    || (Math.pow(sideB, 2) + Math.pow(sideC, 2) == Math.pow(sideA, 2))) {
            result = TriangleType.RECTANGULAR;

        } else {
            throw new IllegalArgumentException("Can't determine type of triangle with sides: "
                    + sideA + " " + sideB + " " + sideC);
        }

        System.out.println("Type of triangle: " + result);
        return result;
    }

    public boolean canCalcArea(Triangle triangle) {
        return calculatorType == getTriangleType(triangle);
    }

    public abstract double calcArea(Triangle triangle);

}
