package java_lessons.lesson_19;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        if (isValidRectangle(width, height)) {
            this.width = width;
            this.height = height;
        } else throw new IllegalArgumentException("Can't create rectangle with sides: "
                + width + " " + height);
    }

    public static boolean isValidRectangle(int width, int height) {
        return width > 0 && height > 0;
    }

    public boolean isSquare() {
        return this.width == this.height;
    }

}
