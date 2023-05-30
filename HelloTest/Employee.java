public class Employee {
	private String empName;
	private int joinYear;
	private String address;
	public Employee(String name, int join,String add)
	{
		this.empName = name;
		this.joinYear = join;
		this.address = add;
	}
	
	public void display()
	{
		System.out.println(this.empName+"		"+this.joinYear+"			"+this.address);
	}
	
	@Override
	public String toString()
	{
		return("Employee Name: "+this.empName+" Joining Year: "+this.joinYear+" Address: "+this.address);
	}
}
