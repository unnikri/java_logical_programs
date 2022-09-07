import java.util.Scanner;
public class palindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number ");
    int n=sc.nextInt();
    int d,r=0;
    int temp=n;
    while(n>0)
      {
        d=n%10;
        r=r*10+d;
        n=n/10;
      }
    if(r==temp)
      System.out.println("Palindrome number");
    else
       System.out.println("Not a Palindrome number");
    sc.close();
  }
}
/*d=202%10=2
  r=2
  n=202/10=20,d=0,r=2*10+0=20,n=2,d=2%10=0,r=20*10=200,n=

  */
      
        