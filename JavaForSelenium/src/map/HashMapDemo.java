package map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "AutoIT");
		hm.put(4, "Coded UI");
		hm.put(null, "val1");
		hm.put(null, "val2");
		
		System.out.println(hm.get(3));
		System.out.println(hm.keySet()+" "+hm.values());

	}
}
