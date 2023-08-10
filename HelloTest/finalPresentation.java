// final is a non-access modifier
// final stops inheritance
final class finalClass {
	public int a = 10; // final class variable are not final implicitly

	public void func() // implicitly defined final by compiler
	{
		a = 20;
		System.out.println("Final class method");
	}
}

// final variable,methods cannot be modified/overridden
class finalDemo {
	public final int a = 10;
	public int b = 20;

	void func() {
//		a=20; //raises error as variable is declared final
		b = 30;
		System.out.println("Non final method");
	}

	final void finalFunc() {
		System.out.println("Cannot override this function");
	}

	final void finalFunc(int i) {
		System.out.println("Can be Overloaded");
	}
}

public class finalPresentation {

	public static void main(String[] args) {
		finalClass fc = new finalClass();
		finalDemo fd = new finalDemo();
		fc.func();
		fc.a = 20; // final class variable can be modified as they are not final implicitly
		fd.func();
		fd.finalFunc();
		fd.finalFunc(2);
	}

}