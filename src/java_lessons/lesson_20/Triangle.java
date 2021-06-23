package java_lessons.lesson_20;

public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(Point a, Point b, Point c) {
        this(a.getDistanceTo(b), a.getDistanceTo(c), b.getDistanceTo(c));
    }

    private Triangle(int sideA, int sideB, int sideC) {
        if (isValidTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else throw new IllegalArgumentException("Can't create triangle with sides: "
                + sideA + " " + sideB + " " + sideC);
    }

    public static boolean isValidTriangle(int sideA, int sideB, int sideC) {
        return sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA;
    }

    public String getDescription() {
        return isRightTriangle() ? "right triangle" : "not right triangle";
    }
    private boolean isRightTriangle() {
        return this.sideA * this.sideA + this.sideB * this.sideB == this.sideC * this.sideC ||
                this.sideA * this.sideA + this.sideC * this.sideC == this.sideB * this.sideB ||
                this.sideB * this.sideB + this.sideC * this.sideC == this.sideA * this.sideA;
    }

}
