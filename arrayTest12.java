import java.util.*;
class arrayTest1
{
	public static void main(String arg[])
	{
		int a[]=new int[10];
   		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the array values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=Sc.nextInt();
		}
		System.out.println("the array values are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}