import java.util.*;
class array test1
public static void main(string arg[])
{
int a[]=new int [10];
scanner sc=new scanner(system.in);
system.out.println("enter the array values");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextint();
}
system.out.println("the array values are in reverse order");
for(int i=0;i<a.lenght-1;i>=0;i--)
{
system.out.println(a[i]);
}
}