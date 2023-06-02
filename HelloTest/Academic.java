
public class Academic extends PersonalStudent {
	public int enrollment;
	public String result;
	Academic(String name, String email, String add, int pno, int enrollment, String result) {
		super(name, email, add, pno);
		this.enrollment = enrollment;
		this.result = result;
	}
	Academic(){}
	public int getEnrollment() {
		return enrollment;
	}
	public void setEnrollment(int enrollment) {
		this.enrollment = enrollment;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	@Override
	public String toString()
	{
		return("Enrollment Number: "+ this.getEnrollment()+" Result: "+this.getResult());
	}

}
