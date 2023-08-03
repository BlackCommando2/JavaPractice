package CollectionExample;
import java.util.ArrayList;
public class ArrayListMax {
    public static int max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("Max value: " + max(list1)); 

        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Max value: " + max(list2));
    }
}
