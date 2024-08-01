import java.util.*;
        class arraysum
{
            public static void main (String arg[])
{
            Scanner sc=new Scanner(System.in);
            int arr[]= new int[10];
            int sum=0,i;
            System.out.println("Enter  array value:");
            for ( i=0;i<arr.length;i++)
            {
            arr[i]= sc.nextInt();
            sum +=arr[i];
             }

            System.out.println("The sum of array elemts is:"+ sum);
            sc.close();


}

}