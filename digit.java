import java.util.Scanner;
class digit{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter mobile number ");
    long A;
     A=sc.nextLong();
    if((A+"").length()==10)
   System.out.println("The last 4 digits of mobile number is " +A%10000);
    else
      System.out.println("not a valid number ");

    
  }
}