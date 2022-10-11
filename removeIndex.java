//remove selected index position and print
import java.util.Scanner;
class removeIndex{
  public static void main(String args[]){
    int i,m;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the  array ");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Ente the array");
    for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
    System.out.println("Enter the index position which element to be deleted ");
      m=sc.nextInt();
      
    System.out.println("The array after removind is ");
    for( i=0;i<n;i++)
      {
        if(m==i)
        {
          continue;
        }
        System.out.print(a[i]);
       }
  }
}
  