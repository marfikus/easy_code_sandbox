package java_lessons.lesson_25;

import org.jetbrains.annotations.NotNull;

public class GeoDataCloudDataSource implements DataSource<GeoData> {

    @NotNull
    @Override
    public GeoData getData() {
        return new GeoData(2, 54.352, 66.221);
    }
}
