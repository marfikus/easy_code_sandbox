package java_lessons.lesson_30.task_1;

public class RightTriangleChain extends TriangleChain {

    @Override
    boolean satisfyConditions(Triangle tr) {
        int side1Pow2 = tr.getSide1() * tr.getSide1();
        int side2Pow2 = tr.getSide2() * tr.getSide2();
        int side3Pow2 = tr.getSide3() * tr.getSide3();

        return side1Pow2 + side2Pow2 == side3Pow2 ||
                side1Pow2 + side3Pow2 == side2Pow2 ||
                side2Pow2 + side3Pow2 == side1Pow2;
    }

    @Override
    String getTriangleType() {
        return "Right triangle";
    }

    @Override
    public double calc(Triangle tr) {
        int biggest = findMax(tr.getSide1(), tr.getSide2(), tr.getSide3());
        double result;

        if (biggest == tr.getSide1()) {
            result = tr.getSide2() * tr.getSide3();
        } else if (biggest == tr.getSide2()) {
            result = tr.getSide1() * tr.getSide3();
        } else {
            result = tr.getSide1() * tr.getSide2();
        }

        return 0.5 * result;
    }

    private int findMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
}
