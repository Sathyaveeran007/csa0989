class SortASC
{
public static void main(String[] args)
{
int arr[]={5,6,3,8,1};

int temp=0;
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])

{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("Elements of array sorted in ASC oder:");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}