package java_lessons.lesson_29.task_1;

public class AreaCalculatorChain {

    private final AreaCalculator calculator;
    private AreaCalculatorChain nextCalculatorChain = null;

    public AreaCalculatorChain(AreaCalculator calculator) {
        this.calculator = calculator;
    }

    public void setNextCalculatorChain(AreaCalculatorChain nextCalculatorChain) {
        this.nextCalculatorChain = nextCalculatorChain;
    }

    public double calcArea(Triangle triangle) {
        double result;

        if (calculator.canCalcArea(triangle)) {
            result = calculator.calcArea(triangle);
        } else if (nextCalculatorChain != null) {
            result = nextCalculatorChain.calcArea(triangle);
        } else {
            throw new RuntimeException("end of chain!");
        }

        return result;
    }
}
