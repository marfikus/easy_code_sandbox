package java_lessons.lesson_26;

public class EmployeeChain {

    private final Employee employee;
    private EmployeeChain nextEmployeeChain;

    public EmployeeChain(Employee employee) {
        this.employee = employee;
    }

    public boolean doTask(Task task) {
        boolean result;

        if (task.getStatus() == employee.getTaskStatus()) {
            employee.doTask(task);
            result = true;
        } else if (nextEmployeeChain != null) {
            result = nextEmployeeChain.doTask(task);
        } else {
            result = false;
        }

        return result;
    }

    public void setNextEmployeeChain(EmployeeChain nextEmployeeChain) {
        this.nextEmployeeChain = nextEmployeeChain;
    }
}
