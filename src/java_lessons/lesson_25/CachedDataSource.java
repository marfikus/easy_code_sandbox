package java_lessons.lesson_25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CachedDataSource extends DataSource {

    private MyData myData;

    @Nullable
    @Override
    public MyData getData() {
        return myData;
    }

    @Override
    public void saveData(@NotNull MyData data) {
        myData = data;
    }


}
