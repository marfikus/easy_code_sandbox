package java_lessons.lesson_30.task_1;

public class IsoscelesTriangleChain extends TriangleChain {

    @Override
    boolean satisfyConditions(Triangle triangle) {
        return triangle.getSide1() == triangle.getSide2() ||
                triangle.getSide1() == triangle.getSide3() ||
                triangle.getSide2() == triangle.getSide3();
    }

    @Override
    String getTriangleType() {
        return "Isosceles triangle";
    }

    @Override
    public double calc(Triangle triangle) {
        int base = triangle.getSide1();
        int side = triangle.getSide2();

        if (triangle.getSide1() == triangle.getSide2()) {
            base = triangle.getSide3();
            side = triangle.getSide1();
        } else if (triangle.getSide1() == triangle.getSide3()) {
            base = triangle.getSide2();
            side = triangle.getSide1();
        }

        double half = 0.5 * base;
        double height = Math.sqrt(side * side - half * half);

        return half * height;
    }
}
