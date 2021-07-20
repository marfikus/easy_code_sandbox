package kotlin_lessons.lesson_8;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private int age;
    private final List<String> items = new ArrayList<>();

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        // так не надо делать, ибо извне можно будет изменить список
//        return items;

        return new ArrayList<>(items);
    }

    @Override
    public String toString() {
        return "Person{" +
                "items=" + items +
                "}";
    }
}
