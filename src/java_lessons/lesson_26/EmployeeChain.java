package java_lessons.lesson_26;

public class EmployeeChain {

    private final Employee employee;
    private EmployeeChain nextEmployeeChain;

    public EmployeeChain(Employee employee) {
        this.employee = employee;
    }

    public void doTask(Task task) {
        if (task.getStatus() == employee.getTaskStatus()) {
            employee.doTask(task);
        } else if (nextEmployeeChain != null) {
            nextEmployeeChain.doTask(task);
        } else {
            throw new IllegalArgumentException("task can't be handled!");
        }
    }

    public void setNextEmployeeChain(EmployeeChain nextEmployeeChain) {
        this.nextEmployeeChain = nextEmployeeChain;
    }
}
