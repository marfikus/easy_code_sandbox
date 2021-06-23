package java_lessons.lesson_20;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getDistanceTo(Point other) {
        // TODO: 23.06.2021 баг: возвращает целое значение, а корень не всегда целый
        return (int) Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }
}
