package java_lessons.lesson_30.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Triangle> triangleList = new ArrayList<>();
        triangleList.add(new Triangle(4, 4, 4));
        triangleList.add(new Triangle(4, 6, 6));
        triangleList.add(new Triangle(3, 4, 5));
        triangleList.add(new Triangle(4, 5, 6));
        triangleList.add(new Triangle(4, 1, 6));

        TriangleChain chain0 = new EquilateralTriangleChain();
        TriangleChain chain1 = new IsoscelesTriangleChain();
        TriangleChain chain2 = new RightTriangleChain();
        TriangleChain chain3 = new BaseTriangleChain();
        chain2.setNext(chain3);
        chain1.setNext(chain2);
        chain0.setNext(chain1);

        for (Triangle triangle : triangleList) {
            print(chain0.getSquare(triangle));
        }

    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
