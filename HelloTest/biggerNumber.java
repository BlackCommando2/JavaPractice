import java.util.Scanner;
public class biggerNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number1 = input.nextInt();
		System.out.print("Enter a number: ");
		int number2 = input.nextInt();
		System.out.print("Biggest Number: ");
		System.out.println(number1>=number2?number1:number2);
	}

}
