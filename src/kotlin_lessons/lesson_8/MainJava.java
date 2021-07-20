package kotlin_lessons.lesson_8;

public class MainJava {

    public static void main(String[] args) {

        Person person = new Person(3);
        person.addItem("one");
        person.addItem("two");
        person.addItem("three");
        System.out.println(person);

        // так вот можно изменить список в классе,
        // если метод будет отдавать нам его, что нехорошо...
        person.getItems().set(0, "new");
        person.getItems().set(1, "new");
        person.getItems().set(2, "new");
        System.out.println(person);

        System.out.println(person.getAge());



    }
}
