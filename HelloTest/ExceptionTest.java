
public class ExceptionTest {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());		
		}

	}

}
