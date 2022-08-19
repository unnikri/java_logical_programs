import java.util.Scanner;
class swap{
  public static void main(String args[]){
    int a;
    int b;
    int temp=0;
    Scanner num= new Scanner(System.in);
    System.out.println("enter the a value ");
    a=num.nextInt();
    System.out.println("enter the b value");
    b=num.nextInt();
    System.out.println("Before swapping");
    System.out.println(" a="+a);
    System.out.println(" b="+b);
    System.out.println(" ");
    temp=a;
    a=b;
    b=temp;
    System.out.println("After swapping");
    System.out.println(" a="+a);
    System.out.println(" b="+b);
  
    
  }
}