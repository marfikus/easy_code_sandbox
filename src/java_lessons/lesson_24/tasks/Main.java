package java_lessons.lesson_24.tasks;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

//        print(getDaysInMonth("jul"));

        WorkerFactory factory = new WorkerFactory();
        Worker[] workers = {
                factory.create(11000, 2),
                factory.create(1010, 1),
                factory.create(21000, 4),
                factory.create(101000, 2)
        };
        print(workers);
        print("");

        Worker[] filteredWorkers = WorkersRecruter.juniorFilter(workers);
        print(filteredWorkers);
    }

    private static void print(Worker[] workers) {
        for (Worker worker : workers) {
            print(worker.toString());
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static void print(int text) {
        System.out.println(text);
    }

    private static int getDaysInMonth(String month) {
//        int calYear = 2021;
        int calYear = Calendar.getInstance().get(Calendar.YEAR); //get current year
        int calDay = 1;
        int calMonth = switch (month.toLowerCase()) {
            case "jan", "янв" -> Calendar.JANUARY;
            case "feb", "фев" -> Calendar.FEBRUARY;
            case "mar", "мар" -> Calendar.MARCH;
            case "apr", "апр" -> Calendar.APRIL;
            case "may", "май" -> Calendar.MAY;
            case "jun", "июн" -> Calendar.JUNE;
            case "jul", "июл" -> Calendar.JULY;
            case "aug", "авг" -> Calendar.AUGUST;
            case "sep", "сен" -> Calendar.SEPTEMBER;
            case "oct", "окт" -> Calendar.OCTOBER;
            case "nov", "ноя" -> Calendar.NOVEMBER;
            case "dec", "дек" -> Calendar.DECEMBER;
            default -> throw new IllegalArgumentException("Undefined value of month: " + month);
        };

        Calendar calendar = new GregorianCalendar(calYear, calMonth, calDay);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
