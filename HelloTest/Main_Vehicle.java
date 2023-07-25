public class Main_Vehicle {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setvNo(42069);
		v1.setvType("Sports");
		System.out.println(v1.toString());
		v1.showMsg();
	}
}
