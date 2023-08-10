class spicyTaste implements FoodTaste {
	public void liebeTaste() {
		System.out.println("liebe Spicy");
	}
}

public class liebeFood {

	public static void main(String[] args) {
		spicyTaste st = new spicyTaste();
		st.liebeTaste();
		st.liebe();
	}

}
