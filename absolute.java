import java.util.Scanner;
class absolute{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number ");
    int a =sc.nextInt();
    if (a<0)
    {
  System.out.println(" Absolute value is : "+(-a));
  }
  else 
     System.out.println("Absolute value is : " +a);
}
}