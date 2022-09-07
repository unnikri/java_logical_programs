//program to Search a particular number from a list(linear search)
import java.util.Scanner;
class linearSearch
{
  public static void main(String args[]){
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size ");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements of the array ");
    for( i=0;i<n;i++)
      {
    a[i]=sc.nextInt();
      }
    System.out.println("The elements of the array are ");
    for(  i=0;i<n;i++)
      {
        System.out.println( " a["+i+"] = "  +a[i]);
      }
    System.out.println("Enter the element to search ");
      int search=sc.nextInt();
    for( i=0;i<n;i++)
      {
        if(search==a[i])
        {
          System.out.println("The element found at a["+i+"] ");
        break;
      }
      }
    if(i==n)
      System.out.println("element not found ");
  }
}


