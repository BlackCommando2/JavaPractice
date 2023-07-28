import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrograms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array: ");
		int[] arr = new int[5];
		int sum=0,smaller=0,larger=0;
		for (int i = 0; i < 10; i++) 
		{
			if (sc.hasNextInt()) 
			{
				arr[i] = sc.nextInt();
		    }
			sum+=arr[i];
			if(i==0) {smaller=arr[i];larger=arr[i];}
			if(arr[i]<smaller) {smaller=arr[i];}
			else if(arr[i]>larger) {larger=arr[i];}
		}
		for(int a: arr) {
		System.out.println(a);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum: "+sum);
		System.out.println("larger: "+sum);
		System.out.println("smaller: "+sum);

	}

}
