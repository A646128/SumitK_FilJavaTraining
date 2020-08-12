package programs;

// Replace Single Character in a String
public class ReplaceSingleChar 
{
  public static void main(String[] args)
  {
    String abc = "ABC DEF GHI JKL MNO PQR STU VWX YZ";
    String def = abc.replace('H', '_');
    System.out.println(abc);
    System.out.println(def);
  }
}

