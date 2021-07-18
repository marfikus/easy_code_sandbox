package kotlin_lessons.lesson_5;

import java.util.Objects;

public class MyItemJava {

    private final int i;
    private final String s;
    private final MyCallback callback;


    public MyItemJava(int i, String s, MyCallback callback) {
        this.i = i;
        this.s = s;
        this.callback = callback;
    }

    @Override
    public boolean equals(Object o) {
        callback.equalsCalled();
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyItemJava myItem = (MyItemJava) o;
        return i == myItem.i && Objects.equals(s, myItem.s);
    }

    @Override
    public int hashCode() {
        callback.hashCodeCalled();
        return Objects.hash(i, s);
    }

    @Override
    public String toString() {
        return "MyItem{" +
                "i=" + i +
                ", s=" + s + '\'' +
                '}';
    }
}
