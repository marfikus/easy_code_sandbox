package java_lessons.lesson_22.tasks;

public abstract class Animal {
    protected final String type;
    protected final String name;

    protected Animal(String name) {
        this.type = this.getClass().getSimpleName();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal type: " + type + " , name: " + name;
    }

    public String move(String direction) {
        return type + " with name \"" + name + "\" move to " + direction;
    }
}
