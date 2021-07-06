package java_lessons.lesson_24;

public class Main {

    public static void main(String[] args) {

        print(checkMonth("january"));
        print(checkMonth("fff"));

        print(getDaysForMonth("january"));
        print(getDaysForMonth("ddd"));

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
