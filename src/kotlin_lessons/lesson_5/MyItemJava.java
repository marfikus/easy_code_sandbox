package kotlin_lessons.lesson_5;

import java.util.Objects;

public class MyItemJava {

    private final int i;
    private final String s;


    public MyItemJava(int i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyItemJava myItem = (MyItemJava) o;
        return i == myItem.i && Objects.equals(s, myItem.s);
    }

    @Override
    public int hashCode() {
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
