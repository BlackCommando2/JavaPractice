
public class test {

	public static void main(String[] args) 
	{
		Employee[] emp = new Employee[3];
		emp[0] = new Employee("abc",2000,"ewvwevw");
		emp[1] = new Employee("jkl",2010,"fwefewew");
		emp[2] = new Employee("bnm",2020,"wfwegwe");
		System.out.println("Name		Year of Joining		Address");
		emp[0].display();
		emp[1].display();
		emp[2].display();
	}
}
