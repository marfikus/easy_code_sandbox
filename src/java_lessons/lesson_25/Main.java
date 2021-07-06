package java_lessons.lesson_25;

public class Main {

    public static void main(String[] args) {

        DataSource<MyData> repository = new Repository<>(
                new MyDataCloudDataSource(),
                new CachedDataSource<>()
        );

        MyData data = repository.getData();
        data = repository.getData();
        print(data.toString());

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}