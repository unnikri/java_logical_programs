//sum of odd n numbers
import java.util.Scanner;
class continueE{
  public static void main(String args[]){
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a value ");
    int n=sc.nextInt();
    for(int i=0;i<=n;i++)
      {
        if(i%2==0)
        {
          continue;
        }
      
            sum=sum+i;
      }
        System.out.print(sum);
      
  }
}
