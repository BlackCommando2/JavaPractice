package ThreadTest;

public class Thread_ByExtend {

	public static void main(String[] args) throws InterruptedException {
//    MyClass1 mc = new MyClass1();
//    mc.start();
    
    Thread_Interface myThread = new Thread_Interface(); 
    //instantiating your thread class that implements Runnable interface
    
    Thread t = new Thread(myThread);     
    //Creating an object to Thread class by passing your thread as an argument

    t.start();  //Starting the thread
    
    /*System.out.println(t.getName());
    System.out.println("id=="+t.getId());
    
    Thread.sleep(1000);
    
    System.out.println(t.getState());*/
    
	}

}