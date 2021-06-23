package java_lessons.lesson_20;

public class Main {

    public static void main(String[] args) {

        Triangle t1 = new Triangle(
                new Point(0, 3),
                new Point(4, 0),
                new Point(0, 0)
        );
        System.out.println(t1.getDescription());


    }
}
