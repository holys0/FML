import java.util.Scanner;

public class ex18 {
    static Scanner ariel = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = createArray();

        printArray(arr);


    }

    public static void initializeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ariel.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();
    }

    public static int[] createArray() {
        int[] arr = new int[]{1, 3, 5};

//        for (int i=0; i<arr.length; i++) {
//                arr[i] = ariel.nextInt();
//        }

        return arr;
    }
}
