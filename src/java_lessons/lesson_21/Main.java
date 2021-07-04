package java_lessons.lesson_21;

public class Main {

    public static void main(String[] args) {

        Option op1 = new Option("ddd", false);
        op1 = new Option(op1, true);

        Circle circle = new Circle(3);
        System.out.println(circle.getPerimeter());

        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println(rectangle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getPerimeter());
    }
}
