
public class Vehicle implements VehicleInterface{
	private int vNo=0;
	private String vType="";
	public int getvNo() {
		return vNo;
	}
	public void setvNo(int vNo) {
		this.vNo = vNo;
	}
	public String getvType() {
		return vType;
	}
	public void setvType(String vType) {
		this.vType = vType;
	}
	@Override
	public String toString() {
		return "Vehicle [vNo=" + vNo + ", vType=" + vType + ", getvNo()=" + getvNo() + ", getvType()=" + getvType()
				+ "]";
	}
	@Override
	public void showMsg()
	{
		System.out.println(this.toString());
	}
	
}
