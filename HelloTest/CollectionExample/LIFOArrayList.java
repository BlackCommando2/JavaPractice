package CollectionExample;

import java.util.ArrayList;

public class LIFOArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayStudent> ar1 = new ArrayList<ArrayStudent>(5);

		ArrayStudent s1 = new ArrayStudent();
		s1.setNo(1);
		s1.setEmail("aa@aa.com");

		ar1.add(s1);
		ArrayStudent s2 = new ArrayStudent();

		s2.setNo(2);
		s2.setEmail("b@bb.com");

		ar1.add(s2);

		ArrayStudent s3 = new ArrayStudent();

		s3.setNo(3);
		s3.setEmail("cc@cc.com");

		ar1.add(s3);

		System.out.println(ar1);

	}

}