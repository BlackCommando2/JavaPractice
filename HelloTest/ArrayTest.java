import java.util.Scanner;
import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array: ");
		int[] arr = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			if (sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
			sum += arr[i];
		}
		for (int a : arr) {
			System.out.println(a);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum: " + sum);
	}

}
