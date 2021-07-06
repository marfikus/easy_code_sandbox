package java_lessons.lesson_24.tasks;

import java.util.ArrayList;

public class WorkersRecruter {

    public static Worker[] juniorFilter(Worker[] workers) {
        Worker[] result = {};
        ArrayList<Worker> resList = new ArrayList<Worker>();

        for (Worker worker : workers) {
            if (!worker.getType().equals(WorkerType.JUNIOR)) {
                resList.add(worker);
            }
        }
        result = resList.toArray(Worker[]::new);
        return result;
    }

}
