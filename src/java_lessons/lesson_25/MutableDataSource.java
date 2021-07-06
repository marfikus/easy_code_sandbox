package java_lessons.lesson_25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MutableDataSource extends DataSource {

    void saveData(@NotNull MyData data);
}
