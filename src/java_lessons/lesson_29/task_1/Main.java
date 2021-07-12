package java_lessons.lesson_29.task_1;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4, 5);

        AreaCalculatorChain chain = new AreaCalculatorChain(
                new EquilateralTriangleAreaCalculator(),
                new AreaCalculatorChain(
                        new IsoscelesTriangleAreaCalculator(),
                        new RectangularTriangleAreaCalculator()
                )
        );

        print(chain.calcArea(triangle));

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
