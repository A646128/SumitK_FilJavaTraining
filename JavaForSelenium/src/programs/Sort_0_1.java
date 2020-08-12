package programs;

public class Sort_0_1 {

	public static void main(String[] args) 
	{
	int arr[] = new int[]{0,1,1,0,1,0,1};
	int count=0;
	int n = arr.length;
	int i;
	for (i=0; i<n; i++)
	{
		if(arr[i]==0)
		{
			count++;
		}
	}
	for ( i=0; i<count; i++)
	{
		arr[i]=0;
	}
	for ( i=count; i<n; i++)
	{
		arr[i]=1;
	}
	for ( i = 0; i < n; i++)
	{
		System.out.print(+arr[i]);
	}
 }
}
