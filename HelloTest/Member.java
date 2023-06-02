
public class Member {
	public String name;
	public int age;
	public int phonenumber;
	public String address;
	public int salary;
	Member(String name,int age, int pno, String add, int salary)
	{
		this.name = name;
		this.age = age;
		this.phonenumber = pno;
		this.address = add;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return ("Name: "+ this.getName()+" Salary: " + this.getSalary());
	}
}
