import java.util.Scanner;
class whileFact{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int m=1;
    int temp=n;
    while(n>=1)
      {
        m=m*n;
        n--;
      }
    System.out.println("The factorial of "+temp+" is " +m);
    sc.close();
  }
}
