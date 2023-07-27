class MyException extends Exception {
	public MyException(String s)
	{
		super(s);
	}
}
public class UserDefinedThrow {
	public static void main(String[] args) {
		try {
			evenodd(10);
		}
		catch(MyException e) {
			System.out.println(e);
		}
	}
	
	public static void evenodd(int s) throws MyException
	{
			if(s%2==0)
			{
				throw new MyException("even number");
			}
			else {
				throw new MyException("odd number");
			}	
	}
}
