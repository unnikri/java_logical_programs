/*import java.util.Scanner;
class factorial{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value :");
    int n=sc.nextInt();
    int m=1;
    for(int i=1;i<=n;i++)
      {
      m=m*i;
      }
    System.out.println("The factorial of "+n+" is " +m);
      }
}*/
/*
5x4x3x2x1
4
m=1*1 1
1*2    2
2*3    6
6*4     24



  */
import java.util.Scanner;
class factorial{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value :");
    int n=sc.nextInt();
    int m=1;
    for( ;n>=1;n--)
      {
      m=m*n;
      }
    System.out.println("The factorial of "+n+" is " +m);
      }
}