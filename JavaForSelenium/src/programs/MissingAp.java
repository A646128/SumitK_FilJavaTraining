package programs;
// Missing number from AP:
public class MissingAp
{
 public static void main(String args[])
  {
    int arr[] ={10,8,4,2,0,-2,-4,-6,-8,-10,-12};
    int difference[]=new int[arr.length-1];
    int missingTerm;

    for(int i=1;i<arr.length;i++)
    {
        difference[i-1] = arr[i]-arr[i-1];
    }
    for(int j =0;j<arr.length;j++)
    {
        if(difference[j]!=difference[j+1])
        {
            missingTerm = arr[j]+difference[j+1];
            System.out.println("The missing term is: " + missingTerm );
        break;
        }
    }
  }
}
