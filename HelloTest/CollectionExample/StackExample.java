package CollectionExample;

import java.util.*;

public class StackExample{
	public static void main(String[] argd) {
		Stack<String> animals = new Stack<>();

		// Add elements to Stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");

		System.out.println("Initial Stack: " + animals);

		// Remove element stacks
		String element = animals.pop();
		System.out.println("Removed Element: " + element);
		System.out.println("Initial Stack: " + animals);

		String element1 = animals.peek();
		System.out.println("Element at top: " + element1);

		// Search an element
		int position = animals.search("Horse");
		System.out.println("Position of Horse: " + position);

		// Check if stack is empty
		animals.clear();
		System.out.println("Initial Stack: " + animals);
		boolean result = animals.empty();
		System.out.println("Is the stack empty? " + result);
	}

}