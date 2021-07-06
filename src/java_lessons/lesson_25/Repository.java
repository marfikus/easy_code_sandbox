package java_lessons.lesson_25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Repository implements DataSource {

    private final DataSource cloudDataSource;
    private final MutableDataSource cachedDataSource;

    public Repository(DataSource cloudDataSource,
                      MutableDataSource cachedDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }

    @Nullable
    @Override
    public MyData getData() {
        MyData result = cachedDataSource.getData();
        if (result == null) {
            System.out.println("no data in cache!");
            result = cloudDataSource.getData();
            cachedDataSource.saveData(result);
        } else {
            System.out.println("getting from cache!");
        }
        return result;
    }

}
