package java_lessons.lesson_28;

import java.util.ArrayList;
import java.util.List;

public class Column implements Observable {

    private final Task.Status status;
    private final List<Observer> observers;
    private final List<Task> tasks;

    public Column(Task.Status status) {
        this.status = status;
        this.observers = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public boolean contains(Task.Status status) {
        return this.status == status;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleTask(tasks.get(0));
        }
    }

}
