import java.util.Arrays;
import java.util.Scanner;
public class arrayMenu {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Menu:");
        System.out.println("1. Sorting");
        System.out.println("2. Total of all elements");
        System.out.println("3. Merging two arrays");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Arrays.sort(array);
                System.out.println("Sorted array: " + Arrays.toString(array));
                break;
            case 2:
                int total = 0;
                for (int num : array) {
                    total += num;
                }
                System.out.println("Total of all elements: " + total);
                break;
            case 3:
                System.out.print("Enter the size of the second array: ");
                int size2 = scanner.nextInt();
                int[] array2 = new int[size2];
                System.out.println("Enter " + size2 + " elements for the second array:");
                for (int i = 0; i < size2; i++) {
                    array2[i] = scanner.nextInt();
                }

                int[] mergedArray = new int[size + size2];
                System.arraycopy(array, 0, mergedArray, 0, size);
                System.arraycopy(array2, 0, mergedArray, size, size2);

                System.out.println("Merged array: " + Arrays.toString(mergedArray));
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        scanner.close();
    }
}
