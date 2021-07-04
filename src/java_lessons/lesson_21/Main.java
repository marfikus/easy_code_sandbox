package java_lessons.lesson_21;

public class Main {

    public static void main(String[] args) {

        Option op1 = new Option("ddd", false);
        op1 = new Option(op1, true);

        Figure[] figures = new Figure[3];
        figures[0] = new Circle(3);
        figures[1] = new Rectangle(2, 5);
        figures[2] = new Triangle(3, 4, 5);

        for (Figure figure: figures) {
            print("Type: " + figure.type + ", Area: " + figure.getArea()
                    + ", Perimeter: " + figure.getPerimeter());
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
