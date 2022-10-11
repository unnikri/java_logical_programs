import java.util.Scanner;
class LargestElement{
public static void main(String args[])
  {
    int i,n,j;
    int temp=0;
  Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array ");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements in the array ");
    int m=0;
    for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
    for(i=0;i<n;i++)//i=0,i=1,i=2,i=3
      {
      if(a[i]>m)
      {
        m=a[i];
      }
   }
   
    System.out.println("the largest number is "+m);

  }
  
}