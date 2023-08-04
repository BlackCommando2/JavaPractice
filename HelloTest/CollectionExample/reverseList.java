package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverseList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }
        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("Numbers in descending order:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        scanner.close();
    }
}
