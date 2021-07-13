package java_lessons.lesson_30.task_1;

public class BaseTriangleChain extends TriangleChain {

    @Override
    boolean satisfyConditions(Triangle tr) {
        int side1 = tr.getSide1();
        int side2 = tr.getSide2();
        int side3 = tr.getSide3();

        return side1 > 0 && side2 > 0 && side3 > 0 &&
                side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1;
    }

    @Override
    String getTriangleType() {
        return "Ordinary triangle";
    }

    @Override
    public double calc(Triangle tr) {
        int half = (tr.getSide1() + tr.getSide2() + tr.getSide3()) / 2;

        return Math.sqrt(half * (half - tr.getSide1()) * (half - tr.getSide2())
                * (half - tr.getSide3()));
    }
}
