//program to print array
/*class array1
{
  public static void main(String args[]){
    int a[]={10,20,30,40,50};
      System.out.println("The value of a[0] is "+a[0]);
    System.out.println("The value of a[1] is "+a[1]);
    System.out.println("The value of a[2] is "+a[2]);
    System.out.println("The value of a[3] is "+a[3]);
    System.out.println("The value of a[4] is "+a[4]);
  }
}*/

//program to print array elements using for loop
/*class array1
{
  public static void main(String args[]){
    int a[]={10,20,30,40,50};
    for(int i=0;i<=4;i++)
      {
      System.out.println("The value of "+a[i]+"  is "+a[i]);
      }
  }
}*/

//program to print elements of the array using Scanner class
/*import java.util.Scanner;
class array1
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size ");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements of the array ");
    for(int i=0;i<n;i++)
      {
    a[i]=sc.nextInt();
      }
    System.out.println("The elements of the array are ");
    for( int i=0;i<n;i++)
      
        System.out.println( " a["+i+"] = "  +a[i]);
        
    
  }
}*/

//program to print sum of array elements
import java.util.Scanner;
class array1
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size ");
    int n=sc.nextInt();
    int a[]=new int[n];
    int sum=0;
    System.out.println("Enter the elements of the array ");
    for(int i=0;i<n;i++)
      {
    a[i]=sc.nextInt();
      }
    System.out.println("The elements of the array are ");
    for( int i=0;i<n;i++)
      {
        System.out.println( " a["+i+"] = "  +a[i]);
      }
    
    for(int i=0;i<n;i++)
      {
         sum=sum+a[i];
      }
    System.out.println("the sum of the elements are " +sum);
    
  }
}