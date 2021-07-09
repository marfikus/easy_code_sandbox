package java_lessons.lesson_27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(2);
        list.add("dfd");
        list.add("ddd");
        print(list);
        list.add("fff");
        list.add("ggg");
        print(list);
        list.remove(1);
        list.remove("fff");
        print(list);
        print(list.contains("dddd"));

        String[] arr = new String[list.size()];
        list.toArray(arr);

        for (String item : arr) {
            print(item);
        }

        List<String> list2 = new ArrayList<>();
        list2.add("qqq");
        list2.addAll(list);
        print(list2);

        List<String> list3 = new ArrayList<>(list);
        list3.add("qqq");
        list3.add(null);
        print(list3);

        print(list3.indexOf("qqq"));

        list3.set(3, "ttt");
        print(list3);

        List<String> list4 = new ArrayList<>();
        list4.add("first");
        list4.add("1");
        list4.add("23");
        list4.add("second");
        list4.add("234");
        list4.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.length() - t1.length();
            }
        });
        print(list4);

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
