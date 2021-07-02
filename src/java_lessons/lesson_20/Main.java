package java_lessons.lesson_20;

public class Main {

    public static void main(String[] args) {

        Triangle t1 = new Triangle(
                new Point(0, 3),
                new Point(4, 0),
                new Point(0, 0)
        );
        System.out.println(t1.getDescription());

        Triangle t2 = new Triangle(
                new Point(0, 0),
                new Point(0, 2),
                new Point(3, 0)
        );
        System.out.println(t2.getDescription());


        Rectangle r1 = new Rectangle(
                new Point(1, 4),
                new Point(2, 5)
        );

    }
}
