package java_lessons.lesson_30.task_1;

public abstract class TriangleChain implements Square {

    private TriangleChain next;

    public void setNext(TriangleChain next) {
        this.next = next;
    }

    public double getSquare(Triangle triangle) {
        if (satisfyConditions(triangle)) {
            System.out.println("The type of triangle is defined: " +
                    getTriangleType());
            return calc(triangle);
        } else if (next != null) {
            return next.getSquare(triangle);
        } else {
            throw new IllegalArgumentException("The square was not calculated");
        }
    }

    abstract boolean satisfyConditions(Triangle triangle);
    abstract String getTriangleType();
}
