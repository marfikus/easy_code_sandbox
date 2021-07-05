package java_lessons.lesson_23;

public class Main {

    public static void main(String[] args) {

        FigureFactory factory = new FigureFactory();

        print(
                factory.create(2),
                factory.create(3, 5),
                factory.create(3, 4, 5)
        );
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static void print(Figure... figures) {
        for (Figure figure : figures) {
            print(figure.toString());
        }
    }
}
