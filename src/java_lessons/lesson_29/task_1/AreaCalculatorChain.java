package java_lessons.lesson_29.task_1;

public class AreaCalculatorChain implements AreaCalcHandler {

    private final AreaCalcHandler calculator;
    private final AreaCalcHandler nextCalculator;

    public AreaCalculatorChain(AreaCalcHandler calculator,
                               AreaCalcHandler nextCalculator) {
        this.calculator = calculator;
        this.nextCalculator = nextCalculator;
    }

    public double calcArea(Triangle triangle) {
        double result;

        if (calculator.canCalcArea(triangle)) {
            result = calculator.calcArea(triangle);
        } else {
            result = nextCalculator.calcArea(triangle);
        }

        return result;
    }

    public boolean canCalcArea(Triangle triangle) {
        return false;
    }
}
