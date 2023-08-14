package CollectionExample;

public class Employee implements Comparable {
	
	private int eno;
	private String ename;
	
	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	public Employee() {
	}
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	public int compareTo(Object o) {
		Employee s2 = (Employee) o;
		//return (int) (this.rollNo - s2.rollNo);
		return this.ename.compareTo(s2.ename);
	}
}
