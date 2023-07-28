import java.io.FileNotFoundException;
import java.io.IOException;

interface A{
	public void tst()throws IOException;
}
class B implements A{
	@Override
	public void tst() throws FileNotFoundException
	{
		System.out.println("Can Override Exception Class B");
	}
}
class C implements A{
	@Override
	public void tst()
	{
		System.out.println("Can Override Exception Class C");
	}
}
public class OverrideThrow{

	public static void main(String[] args) {
		C check = new C();
		check.tst();
		}
}
