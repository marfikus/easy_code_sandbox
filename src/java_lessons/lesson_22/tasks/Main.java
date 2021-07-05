package java_lessons.lesson_22.tasks;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("dd");
        print(dog.move("south"));
        print(dog.toString());

    }

    private static void print(String text) {
        System.out.println(text);
    }
}
