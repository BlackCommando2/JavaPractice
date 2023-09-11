import java.util.Scanner;

public class ElementSearch{
    public static void main(String[] args) {
        
        int[] numbers = { 18,20,56,39};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an element to search for: ");
        int target = scanner.nextInt();

        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println(target + " was found at index " + foundIndex + " in the array.");
        } else {
            System.out.println(target + " was not found in the array.");
        }

        scanner.close();
    }
}
