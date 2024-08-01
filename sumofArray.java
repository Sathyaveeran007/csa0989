import java.util.*;
class sumofArray
{
  public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int arr[] = new int [10];
	int sum= 0;
	System.out.println("Enter array elements:");
	for(int i=0;i< arr.length;i++){
	sum+=arr[i];
}
	System .out.println("the sum of array elements is :=sum");
	sc.close();
}
}
