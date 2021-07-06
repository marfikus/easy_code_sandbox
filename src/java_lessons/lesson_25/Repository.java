package java_lessons.lesson_25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Repository extends DataSource {

    private final DataSource cloudDataSource;
    private final DataSource cachedDataSource;

    public Repository(DataSource cloudDataSource,
                      DataSource cachedDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }

    @Nullable
    @Override
    public MyData getData() {
        MyData result = cachedDataSource.getData();
        if (result == null) {
            result = cloudDataSource.getData();
        }
        return result;
    }
}
