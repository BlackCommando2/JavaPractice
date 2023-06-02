class Product{
	public String name;
	public double price;
	public int quantity;
	public static int totalSold;
	Product(String n, double p, int q)
	{
		this.name = n;
		this.price = p;
		this.quantity = q;
	}
	
	public void sell(int quantity)
	{
		if(this.quantity < quantity)
		{
			System.out.println("Error not enough product");
		}
		else
		{
			totalSold += quantity;
			this.quantity -= quantity;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static int getTotalSold() {
		return totalSold;
	}
	
}
public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("apple",4,30);
		Product p2 = new Product("pineapple",10,10);
		Product p3 = new Product("banana",2,60);
		p1.sell(20);
		p2.sell(1);
		p3.sell(50);
		System.out.println(p1.getTotalSold());
		System.out.println(p2.getTotalSold());
		System.out.println(p3.getTotalSold());
	}

}
