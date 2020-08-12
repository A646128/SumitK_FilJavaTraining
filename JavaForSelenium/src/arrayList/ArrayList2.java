package arrayList;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList obj= new ArrayList();
		obj.add(23456);
		obj.add("S");
		obj.add("SUMIT YADAV");
		obj.add(74.56);
	int myArraySize=obj.size();
	for(int i=0;i<myArraySize;i++)
	{
		Object value = obj.get(i);
		System.out.println("Values of Array with old for loop is "+value);
	}
    for(Object i:obj)
    {
		//Object value = obj.get(i);
		System.out.println("Values of Array with new for loop is "+i);
	}
	}

}
