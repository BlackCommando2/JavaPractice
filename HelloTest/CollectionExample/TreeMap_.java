package CollectionExample;

import java.util.TreeMap;
import java.util.*;
public class TreeMap_ {
	public static void main(String[] args) {
    try {
		  TreeMap<Employee,String> etree = new TreeMap<Employee,String>();
		  
		  etree.put(new Employee(1,"suhaas"), "Manager");
		  etree.put(new Employee(2,"rajeev"), "TeamLader");
		  
		  
		  System.out.println(etree);
		  
    }catch(Exception e) {
    	System.out.println(e.getMessage());
    }
	}

}
