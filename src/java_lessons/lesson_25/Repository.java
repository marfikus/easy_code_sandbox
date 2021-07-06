package java_lessons.lesson_25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Repository<T> implements DataSource<T> {

    private final DataSource<T> cloudDataSource;
    private final MutableDataSource<T> cachedDataSource;

    public Repository(DataSource<T> cloudDataSource,
                      MutableDataSource<T> cachedDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }

    @Nullable
    @Override
    public T getData() {
        T result = cachedDataSource.getData();
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
