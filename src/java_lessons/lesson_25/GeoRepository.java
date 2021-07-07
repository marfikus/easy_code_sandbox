package java_lessons.lesson_25;

public class GeoRepository extends Repository<GeoData> {

    public GeoRepository(DataSource<GeoData> cloudDataSource,
                         MutableDataSource<GeoData> cachedDataSource) {
        super(cloudDataSource, cachedDataSource);
    }
}
