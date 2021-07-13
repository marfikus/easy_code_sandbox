package java_lessons.lesson_30.task_1;

public class Triangle {

    private final int ab;
    private final int bc;
    private final int ac;

    public Triangle(int ab, int bc, int ac) {
        this.ab = ab;
        this.bc = bc;
        this.ac = ac;
    }

    public int getSide1() {
        return ab;
    }

    public int getSide2() {
        return bc;
    }

    public int getSide3() {
        return ac;
    }
}
