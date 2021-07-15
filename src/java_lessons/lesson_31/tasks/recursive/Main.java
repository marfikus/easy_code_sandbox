package java_lessons.lesson_31.tasks.recursive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        print(fib(9));

    }

    private static List<Integer> fib(int n) {
        List<Integer> result = new ArrayList<>();

        if (n >= 1) {
            result.add(0);
            if (n >= 2) {
                result.add(1);
                if (n > 2) {
                    for (int i = 2; i < n; i++) {
                        result.add(result.get(i - 1) + result.get(i - 2));
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("n must be >= 1");
        }

        return result;
    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
