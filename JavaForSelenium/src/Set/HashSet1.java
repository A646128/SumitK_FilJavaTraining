package Set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> values = new HashSet<String>();
		values.add("Sumit");
		values.add("Selenium");
		values.add("Amit");
		values.add("QTP");
		values.add("1");
		values.add("abc");
		
		System.out.println(values);

		ArrayList<String> obj = new ArrayList<>(values);
		System.out.println(obj.get(1));
	}

}
