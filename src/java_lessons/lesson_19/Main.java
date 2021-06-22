package java_lessons.lesson_19;


public class Main {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        if (Triangle.isValidTriangle(a, b, c)) {
            Triangle t1 = new Triangle(a, b, c);
            System.out.println("is right triangle: " + t1.isRightTriangle());
        }

        if (Rectangle.isValidRectangle(a, b)) {
            Rectangle r1 = new Rectangle(a, b);
            System.out.println("it is square: " + r1.isSquare());
        }

//        Rectangle r2 = new Rectangle(0, 9);


    }
}
