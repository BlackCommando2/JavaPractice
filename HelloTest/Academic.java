
public class Academic extends StudentInfo {
	public int enrollment;
	public String result;
	Academic(String Name, int Age, String Branch, int Sem, int enrollment, String result) {
		super(Name, Age, Branch, Sem);
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
