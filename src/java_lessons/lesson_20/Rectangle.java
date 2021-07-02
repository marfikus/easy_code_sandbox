package java_lessons.lesson_20;

public class Rectangle {
    private final int sideA;
    private final int sideB;

    public Rectangle(Point a, Point b) {
        this(a.getAbsDiffX(b), a.getAbsDiffY(b));
    }

    private Rectangle(int sideA, int sideB) {
        if (isValidRectangle(sideA, sideB)) {
            this.sideA = sideA;
            this.sideB = sideB;
        } else throw new IllegalArgumentException("Can't create rectangle with sides: "
                + sideA + " " + sideB);
    }

    private static boolean isValidRectangle(int sideA, int sideB) {
        return sideA > 0 && sideB > 0;
    }

    public String getDescription() {
        String isSquare = isSquare() ? "is square" : "it is not square";
        return "Rectangle with sides: " + sideA + ", " + sideB + "\n"
                + isSquare + "\n" + "Area: " + getArea();
    }

    private boolean isSquare() {
        return this.sideA == this.sideB;
    }

    private int getArea() {
        return sideA * sideB;
    }

}
