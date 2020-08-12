package programs;

// Count Unique Characters In A String
public class CountCharacters 
{
	   public static void main(String args[])
	   {
	      String str="abcdefaaabbbcccdddeeefff";
	      String temp="";
	      for (int i = 0; i < str.length(); i++) {
	         if(temp.indexOf(str.charAt(i)) == -1 ){
	             temp = temp + str.charAt(i);
	         }
	      }
	      System.out.println(temp);
	      System.out.println("Unique character count: " + temp.length());
	   }
	}
