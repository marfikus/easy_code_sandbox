package java_lessons.lesson_25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MutableDataSource<T> extends DataSource<T> {

    void saveData(@NotNull T data);
}
