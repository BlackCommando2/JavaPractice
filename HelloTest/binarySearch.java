import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {

        int[] numbers = { 100, 60, 80, 10, 90, 20, 70, 40, 50, 30 };
        Arrays.sort(numbers);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an element to search for: ");
        int target = scanner.nextInt();

        int foundIndex = SortedBinarySearch(numbers, target);

        if (foundIndex != -1) {
            System.out.println(target + " was found at index " + foundIndex + " in the array.");
        } else {
            System.out.println(target + " was not found in the array.");
        }

        scanner.close();
    }

    public static int SortedBinarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
