package java_lessons.lesson_20;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float getDistanceTo(Point other) {
        return (float) Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }

    public int getAbsDiffX(Point other) {
        return Math.abs(x - other.x);
    }

    public int getAbsDiffY(Point other) {
        return Math.abs(y - other.y);
    }
}
