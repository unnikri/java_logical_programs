//sum of n natural numbers
import java.util.Scanner;
class Forloop{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value :");
    int n=sc.nextInt();
    int m=0;
    for(int i=1;i<=n;i++)
      {
        m=m+i;
          }
        System.out.println(m);
      
  }
}