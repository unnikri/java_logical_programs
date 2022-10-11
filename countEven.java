
//count even and odd numbers
import java.util.Scanner;
class countEven{
  public static void main(String args[]){
    int i,even=0,odd=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the  array ");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Ente the array");
    for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
    for(i=0;i<n;i++)
      {
        if(a[i]%2==0)
        {
        even++;
        }
        else
        {
          odd++;
        }
      }
    System.out.println("The even number are " +even);
    System.out.println("The odd number are " +odd);
  }
}
  