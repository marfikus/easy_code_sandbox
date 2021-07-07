package java_lessons.lesson_25;

public class Main {

    public static void main(String[] args) {

        DataSource<MyData> myDataDataSource = new Repository<>(
                new MyDataCloudDataSource(),
                new CachedDataSource<>()
        );

        DataSource<GeoData> geoDataDataSource = new GeoRepository(
                new GeoDataCloudDataSource(),
                new CachedDataSource<>()
        );

        MyData data = myDataDataSource.getData();
        print(data.toString());
        data = myDataDataSource.getData();
        print(data.toString());

        GeoData geoData = geoDataDataSource.getData();
        print(geoData.toString());
        geoData = geoDataDataSource.getData();
        print(geoData.toString());

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
