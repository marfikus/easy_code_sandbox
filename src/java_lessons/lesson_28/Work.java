package java_lessons.lesson_28;

public class Work {

    private final TaskFactory factory;
    private final EmployeeChain chain;

    public Work(TaskFactory factory,
                EmployeeChain chain) {
        this.factory = factory;
        this.chain = chain;
    }

    public void start() {
        while (true) {
            if (!chain.doTask(factory.getTask())) {
                break;
            }
        }
    }
}
