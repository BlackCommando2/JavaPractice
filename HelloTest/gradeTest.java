import java.text.MessageFormat;
import java.util.Scanner;
public class gradeTest {

	public static void main(String[] args) {
		int sum=0, avg=0;
		Scanner input = new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.print(MessageFormat.format("Enter {0} subject marks: ", i+1));
			int temp = input.nextInt();
			if(temp>100) {
				System.out.println("Enter a marks from 0 to 100");
				i--;
				continue;
			}
			sum+=temp;
		}
		avg = sum/4;
		System.out.print("Grade Obtained: ");
		System.out.println((avg>=90)?"Grade A":(avg>=80 && avg <90)?"Grade B":(avg>=70 && avg <80)?"Grade C":"Fail");
	}

}
