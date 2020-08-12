package map;


import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Selenium");
		ht.put(2, "QTP");
		ht.put(3, "AutoIT");
		ht.put(4, "Coded UI");
		ht.put(null, null);
	//	ht.put(null, "val2");
		System.out.println(ht.get(3));
		System.out.println(ht.keySet()+" "+ht.values());

	}

}
