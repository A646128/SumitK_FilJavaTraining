package programs;
import java.util.*;
public class Palindrome
{
    public static void main(String args[]){
        int num,tNum,sum;
        @SuppressWarnings("resource")
		Scanner bf = new Scanner(System.in);
        //input an integer number
        System.out.print("Enter any integer number: ");
        num= bf.nextInt();
        //find reverse number
        tNum=num;
        sum =0;
        while(tNum>0)
        {
            sum = (sum*10) + (tNum%10);
            tNum/=10;
        }
        //check input number with reversed number
        if(num==sum)
            System.out.println(num + " is a Palindrome Number.");
        else
            System.out.println(num + " is not a Palindrome Number.");
    }
}