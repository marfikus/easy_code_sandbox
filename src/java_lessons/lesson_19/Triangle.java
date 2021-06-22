package java_lessons.lesson_19;

public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
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

    public boolean isRightTriangle() {
        return this.sideA * this.sideA + this.sideB * this.sideB == this.sideC * this.sideC ||
                this.sideA * this.sideA + this.sideC * this.sideC == this.sideB * this.sideB ||
                this.sideB * this.sideB + this.sideC * this.sideC == this.sideA * this.sideA;
    }

}
