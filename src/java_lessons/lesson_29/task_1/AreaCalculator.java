package java_lessons.lesson_29.task_1;

public abstract class AreaCalculator {

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
            result = TriangleType.EQUILITERAL;

        } else if ((sideA == sideB && sideA != sideC)
                || (sideA == sideC && sideA != sideB)
                || (sideB == sideC && sideB != sideA)) {
            result = TriangleType.ISOSCELES;

        } else if ((Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2))
                    || (Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2))
                    || (Math.pow(sideB, 2) + Math.pow(sideC, 2) == Math.pow(sideA, 2))) {
            result = TriangleType.RECTANGULAR;

        } else {
            throw new IllegalArgumentException("Can't determine type on triangle with sides: "
                    + sideA + " " + sideB + " " + sideC);
        }

        return result;
    }

    public boolean canCalcArea(Triangle triangle) {
        return calculatorType == getTriangleType(triangle);
    }

    public abstract double calcArea(Triangle triangle);

}
