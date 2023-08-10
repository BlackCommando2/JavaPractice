class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

public class UserDefinedThrow {
	public static void main(String[] args) throws MyException {
		System.out.println(test(10));
	}

	public static int test(int x) {
		try {
			evenodd(x);
		} catch (MyException e) {
			System.out.println(e);
			return (-1);
		} finally {
			return (1);
		}
	}

	public static void evenodd(int s) throws MyException {
		if (s % 2 == 0) {
			throw new MyException("even number");
		} else {
			throw new MyException("odd number");
		}
	}
}
