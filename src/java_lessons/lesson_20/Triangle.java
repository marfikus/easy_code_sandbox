package java_lessons.lesson_20;

public class Triangle {
    private final float sideA;
    private final float sideB;
    private final float sideC;

    public Triangle(Point a, Point b, Point c) {
        this(a.getDistanceTo(b), a.getDistanceTo(c), b.getDistanceTo(c));
    }

    private Triangle(float sideA, float sideB, float sideC) {
        if (isValidTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else throw new IllegalArgumentException("Can't create triangle with sides: "
                + sideA + " " + sideB + " " + sideC);
    }

    public static boolean isValidTriangle(float sideA, float sideB, float sideC) {
        return sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA;
    }

    public String getDescription() {
        return isRightTriangle() ? "right triangle" : "not right triangle";
    }
    private boolean isRightTriangle() {
        return sideA * sideA + sideB * sideB == sideC * sideC ||
                sideA * sideA + sideC * sideC == sideB * sideB ||
                sideB * sideB + sideC * sideC == sideA * sideA;
    }

}
