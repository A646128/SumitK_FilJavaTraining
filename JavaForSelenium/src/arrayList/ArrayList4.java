package arrayList;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Selenium");
		obj.add("QTP");
		obj.add("Cucumber");
	//	obj.add(12); Can only add string data
		obj.add("M");
		for(String st:obj)
		{
			System.out.println("Array of sting is "+st);
		}

	}

}
