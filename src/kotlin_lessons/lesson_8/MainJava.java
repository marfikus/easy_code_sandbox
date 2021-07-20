package kotlin_lessons.lesson_8;

import java.util.ArrayList;
import java.util.List;

public class MainJava {

    public static void main(String[] args) {

        Person person = new Person(3);
        person.addItem("one");
        person.addItem("two");
        person.addItem("three");
//        System.out.println(person);

        // так вот можно изменить список в классе,
        // если метод будет отдавать нам его, что нехорошо...
        person.getItems().set(0, "new");
        person.getItems().set(1, "new");
        person.getItems().set(2, "new");
//        System.out.println(person);

//        System.out.println(person.getAge());


        List<Integer> list = new ArrayList<>();
        for (int i = -10; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        List<Integer> list2 = getNewList(list);
        System.out.println(list2);

        List<String> list3 = getMappedList(list2, "number");
        System.out.println(list3);


    }

    private static List<String> getMappedList(List<Integer> source, String prefix) {
        List<String> r = new ArrayList<>();
        for (Integer item : source) {
            r.add(prefix + "_" + item);
        }
        return r;
    }

    private static List<Integer> getNewList(List<Integer> source) {
        List<Integer> positive = new ArrayList<>();
        for (Integer item : source) {
            if (item > 0)
                positive.add(item);
        }
        return positive;
    }
}
