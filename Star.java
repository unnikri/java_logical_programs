/*class Star{
  public static void main(String args[]){
    int i,j;
    for(i=1;i<=5;i++)
      {
        for(j=1;j<i;j++)
          {
            System.out.print(" * ");
          }
        System.out.println();
      }
  }
}*/
import java.util.Scanner;
class Star{
  public static void main(String args[]){
    int i,j;
    Scanner sc=new Scanner(System.in);    
    System.out.println("Enter the size of N ::");
    int n=sc.nextInt();
    for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
          {
            if(i+j==n)
            System.out.print("$");
          else
        System.out.print("*");
            
          }
        System.out.println();
      }
    
  }
}



