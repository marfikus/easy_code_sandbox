package java_lessons.lesson_25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class DataSource {

    @Nullable
    public abstract MyData getData();

    public void saveData(@NotNull MyData data) {

    }
}
