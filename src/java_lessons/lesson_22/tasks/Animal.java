package java_lessons.lesson_22.tasks;

public abstract class Animal {
    private final String type;
    private final String name;

    protected Animal(String name) {
        this.type = this.getClass().getSimpleName();
        this.name = name;
    }

    public String move(String direction) {
        return type + "with " + name + " move to " + direction;
    }
}
