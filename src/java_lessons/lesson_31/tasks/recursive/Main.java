package java_lessons.lesson_31.tasks.recursive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        print(sum(10));
        print(sumRecursive(10));

        print(fib(10));
        print(fibRecursive(10));

    }

    private static int sum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    private static int sumRecursive(int n) {
        int result = 0;
        if (n > 0) {
            result = n + sumRecursive(n - 1);
        }
        return result;
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
        }

        return result;
    }

    private static List<Integer> fibRecursive(int n) {
        List<Integer> result = new ArrayList<>();

        if (n == 0 || n == 1) {
            result.add(0);
        } else if (n == 2) {
            result.add(0);
            result.add(1);
        } else if (n > 2) {
            List<Integer> l1 = fibRecursive(n - 1);
            List<Integer> l2 = fibRecursive(n - 2);
            result.addAll(l1);
            int lastOfL1 = l1.get(l1.size() - 1);
            int lastOfL2 = l2.get(l2.size() - 1);
            result.add(lastOfL1 + lastOfL2);
        }

        return result;
    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
