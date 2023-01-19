import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println("");
        task2();
        System.out.println("");
        task3();
        System.out.println("");
        task4();
        System.out.println("");
    }

    public static void task1() {
        System.out.println("task1");
        int[] array1 = new int[] {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        byte[] array3 = new byte[5];

    }

    private static void task2() {
        System.out.println("task2");
        int[] array1 = new int[] {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        byte[] array3 = {7, 2, 4, 5, 0};

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i != (array1.length - 1)) {
                System.out.print(", ");
            } else {
                break;
            }
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i != array2.length - 1) {
                System.out.print(", ");
            } else {
                break;
            }
        }
        System.out.println();

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i != array3.length - 1) {
                System.out.print(", ");
            } else {
                break;
            }
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("task3");
        int[] array1 = new int[] {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        byte[] array3 = {7, 2, 4, 5, 0};

        for (int i = array1.length-1; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                break;
            }
        }
        System.out.println();

        for (int i = array2.length-1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                break;
            }
        }
        System.out.println();

        for (int i = array3.length-1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                break;
            }
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("task4");
        int[] array1 = new int[] {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        byte[] array3 = {7, 2, 4, 5, 0};

        for (int i = 0; i < array1.length; i++) {
            if( array1[i]%2 != 0) {
                array1[i] = array1[i] +1;
            }
        }
        System.out.print(Arrays.toString(array1));

    }
}