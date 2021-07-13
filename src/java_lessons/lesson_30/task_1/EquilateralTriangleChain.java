package java_lessons.lesson_30.task_1;

public class EquilateralTriangleChain extends TriangleChain {

    @Override
    boolean satisfyConditions(Triangle triangle) {
        return triangle.getSide1() == triangle.getSide2() &&
                triangle.getSide2() == triangle.getSide3() &&
                triangle.getSide1() == triangle.getSide3();
    }

    @Override
    String getTriangleType() {
        return "Equilateral triangle";
    }

    @Override
    public double calc(Triangle triangle) {
        return triangle.getSide1() * triangle.getSide2() *
                Math.sqrt(3) * 0.25;
    }
}
