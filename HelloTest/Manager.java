
public class Manager extends Employee2{
	public String specialization;
	public String department;
	Manager(String name, int age, int pno, String add, int salary,String sp,String depart) {
		super(name, age, pno, add, salary, sp, depart);
		this.specialization = sp;
		this.department = depart;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString()
	{
		return (super.toString());
	}
}
