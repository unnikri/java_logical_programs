import java.util.Scanner;
class maxvalue
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
      {
        System.out.println( " a["+i+"] = "  +a[i]);
      }
    int max=a[0];
    for(int i=0;i<n;i++)
      {
        if(max<a[i])
          max=a[i];
      }
    System.out.println("the maximum value is "+max);
    
       int min=a[0];
    for(int i=0;i<n;i++)
      {
        if(min>a[i])
          min=a[i];
      }
    System.out.println("the minimum value is "+min);
    
  }
}