import java.util.Scanner;

public class Juncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5]; // First array to be populated by user input
        int[] array2 = new int[5]; // Second array to be populated by user input

        System.out.println("Digite os 5 elementos do primeiro array:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Digite os 5 elementos do segundo array:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }
        int[] mergedArray = new int[array1.length + array2.length]; // Third array (merged array)

        // Merging both arrays into the third array
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        // Printing the elements of the merged array
        for (int value : mergedArray) {
            System.out.print(value + " ");
        }
    }
}
