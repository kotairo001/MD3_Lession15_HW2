import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[] createRandom() {
        Random rd = new Random();
        int [] array = new int[100];
        System.out.println("Array's element");
        for (int i = 0; i < array.length; i++) {
            array[i]= rd.nextInt(100);
            System.out.print(array[i]+" ");
        }
        return array;
    }

    public static void main(String[] args) {

        int [] array = createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput an element: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Element has index " + x + " is " + array[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Ouf of bounds exception");
        }
    }

}
