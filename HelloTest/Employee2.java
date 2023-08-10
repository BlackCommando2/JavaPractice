
public class Employee2 extends Member {
	public String specialization;
	public String department;

	Employee2(String name, int age, int pno, String add, int salary, String spec, String depart) {
		super(name, age, pno, add, salary);
		this.specialization = spec;
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
	public String toString() {
		return (super.toString());
	}
}
