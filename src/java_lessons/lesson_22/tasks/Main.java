package java_lessons.lesson_22.tasks;

public class Main {

    public static void main(String[] args) {

/*        Dog dog = new Dog("dd");
        print(dog.move("south"));
        print(dog.toString());*/

        Animal[] animals = {
                new Dog("Pluto"),
                new Fish("Nemo"),
                new Duck("Scrudge")
        };

        for (Animal animal: animals) {
            print(animal.toString());
            print(animal.move("south"));
        }

    }

    private static void print(String text) {
        System.out.println(text);
    }
}
