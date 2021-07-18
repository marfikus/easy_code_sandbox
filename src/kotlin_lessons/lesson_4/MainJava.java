package kotlin_lessons.lesson_4;

public class MainJava {

    public static void main(String[] args) {

/*        boolean stop = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " " + j);
                if (j == 1) {
                    stop = true;
                    break;
                }
            }
            if (stop) {
                break;
            }
        }*/

//        doSome(20);

        Object[] array = new Object[] {2, 3, "g", "v", 5};
        for (Object object : array) {
//            System.out.println(object);
            if (object instanceof String) {
                System.out.println(object);
            }
        }

    }

    public static void doSome(int max) {
        boolean success = true;

        for (int i = 0; i < max; i++) {
            if (i == 3) {
                return;
//                success = false;
//                break;
            }
        }
//        if (success) {
            System.out.println("all done");
//        }
    }

}
