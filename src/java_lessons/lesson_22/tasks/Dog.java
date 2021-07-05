package java_lessons.lesson_22.tasks;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String move(String direction) {
        return type + " with name \"" + name + "\" running to " + direction;
    }
}
