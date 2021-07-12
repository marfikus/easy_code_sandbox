package java_lessons.lesson_29.task_1;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4, 5);

        AreaCalculatorChain chain1 = new AreaCalculatorChain(new EquilateralTriangleAreaCalculator());
        AreaCalculatorChain chain2 = new AreaCalculatorChain(new IsoscelesTriangleAreaCalculator());
        AreaCalculatorChain chain3 = new AreaCalculatorChain(new RectangularTriangleAreaCalculator());
        chain2.setNextCalculatorChain(chain3);
        chain1.setNextCalculatorChain(chain2);

        print(chain1.calcArea(triangle));

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
