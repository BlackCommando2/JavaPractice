package CollectionExample;

import java.util.*;

public class TreeSet_ {

	public static void main(String[] args) {
		// Create a TreeSet with user-defined comparator
		TreeSet<String> cities = new TreeSet<>(new cities_Comparator());
		// add elements to the comparator
		cities.add("Pune");
		cities.add("Hyderabad");
		cities.add("Indore");
		cities.add("Bangaluru");
		// print the contents of TreeSet
		System.out.println("TreeSet: " + cities);
	}
}

class cities_Comparator implements Comparator<String> {
	// override compare method to compare two elements of the TreeSet
	@Override
	public int compare(String cities_one, String cities_two) {
		int value = cities_one.compareTo(cities_two);
		// sort elements in reverse order
		if (value > 0) {
			return -1;
		} else if (value < 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
