package java_lessons.lesson_22.tasks;

public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    @Override
    public String move(String direction) {
        return type + " with name \"" + name + "\" floating to " + direction;
    }
}
