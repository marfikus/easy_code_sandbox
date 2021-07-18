package kotlin_lessons.lesson_5;

public class MyItem {

    private final int i;
    private final String s;


    public MyItem(int i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    public String toString() {
        return "MyItem{" +
                "i=" + i +
                ", s=" + s + '\'' +
                '}';
    }
}
