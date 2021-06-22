package java_lessons.lesson_19;

public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        if (sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA) {

            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            throw new IllegalArgumentException("Can't create triangle with sides: "
                    + sideA + " " + sideB + " " + sideC);
        }
    }


}
