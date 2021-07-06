package java_lessons.lesson_24;

import java.util.Arrays;

public class FigureFactory {

    public Figure create(double... sides) {
        return switch (sides.length) {
            case 1 -> new Circle(sides[0]);
            case 2 -> new Rectangle(sides[0], sides[1]);
            case 3 -> new Triangle(sides[0], sides[1], sides[2]);
            default -> throw new IllegalArgumentException("Can't create object with arguments "
                    + Arrays.toString(sides));
        };
    }
}
