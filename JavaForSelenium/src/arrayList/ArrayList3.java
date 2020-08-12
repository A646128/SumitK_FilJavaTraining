package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList obj= new ArrayList();
		obj.add(23456);
		obj.add("S");
		obj.add("SUMIT YADAV");
		obj.add("SUMIT YADAV");  //Array List accept the duplicate entries as well while Set does not
		obj.add(74.56);
	int myArraySize=obj.size();
	Iterator it=obj.iterator();
	while (it.hasNext())
	{
		Object value = it.next();
		System.out.println("Value of Array Iterator is "+value);
	}
	}

}
