package java_lessons.lesson_24;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

//        print(checkMonth("january"));
//        print(checkMonth("fff"));

//        print(getDaysForMonth("january"));
//        print(getDaysForMonth("ddd"));

        FigureFactory factory = new FigureFactory();
        Figure figure = factory.create(3, 4);
        showDescription(figure);

    }

    private static void showDescription(Figure figure) {
        switch (figure.getType().toLowerCase()) {
            case "circle":
                print("this is a circle");
                break;
            case "rectangle":
                print("this is a rectangle");
                break;
            case "triangle":
                print("this is a triangle");
                break;
            default:
                print("undefined figure");
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static void print(int text) {
        System.out.println(text);
    }

    // здесь суть метода просто проверить входное значение,
    // поскольку switch без brake после первого совпадения
    // игнорирует дальнейшие кейсы и меняет значение days

    // Кмк не очень логично, проще тогда уж сделать проверку
    // на вхождение в enum или что-то подобное...
    private static String checkMonth(String month) {
        String result;
        int days = -1;
        switch (month.toLowerCase()) {
            case "january":
                days = 31;
            case "february":
                days = 28;
            default:
                if (days > 0) {
                    result = month + " is valid value";
                } else {
                    throw new IllegalArgumentException("not recognized month " + month);
                }
        }

        return result;
    }

    private static String getDaysForMonth(String month) {
        String result;
        int days;
        switch (month.toLowerCase()) {
            case "january":
                days = 31;
                break;
            case "february":
                days = 28;
                break;
            default:
                days = -1;
        }

        if (days > 0) {
            result = month + " has " + days + " days.";
        } else {
            throw new IllegalArgumentException("not recognized month " + month);
        }

        return result;
    }
}
