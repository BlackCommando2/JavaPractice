public interface FoodTaste {
	void  liebeTaste();
	default void liebe()
	{
		System.out.println("Liebe Food");
	}
}