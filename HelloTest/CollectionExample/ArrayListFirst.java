package CollectionExample;
import java.util.ArrayList;
public class ArrayListFirst {
    public static String firstElement(ArrayList<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");

        System.out.println("First element: " + firstElement(list1));

        ArrayList<String> list2 = new ArrayList<>();
        System.out.println("First element: " + firstElement(list2));
    }
}