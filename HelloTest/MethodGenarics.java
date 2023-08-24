class DemoClass {
	
  public <T> void genericsMethod(T data) {
    System.out.println("Generics Method:");
    System.out.println("Data Passed: " + data);
  }
  
  public <T>  void test(T data1)
  {
	  System.out.println(data1);
  }
}
public class MethodGenarics {

	public static void main(String[] args) {
		DemoClass demo = new DemoClass();

	   demo.<String> genericsMethod("hhh");
	    demo.<String>genericsMethod("Java Programming");

	  demo.<Double>genericsMethod(45.78);
	    demo.<Integer>genericsMethod(25);
	    
	  
	    
	    demo.<Double>test(45.789);
	  }
	}