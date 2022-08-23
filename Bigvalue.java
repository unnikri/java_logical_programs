import java.util.Scanner;
class Bigvalue{
  public static void main(String args[]){
    int a;
    int b;
    int c;
    Scanner num= new Scanner(System.in);
    System.out.println("enter the A value ");
    a=num.nextInt();
    System.out.println("enter the B value");
    b=num.nextInt();
    System.out.println("enter the C value");
    c=num.nextInt();
    if(a>0)
    {
      if(a>b&&a>c)
      System.out.println("A is the biggest value: ");
       if(b>a&&b>c)
             System.out.println("B is the biggest value: ");
         else
            System.out.println("C is the biggest value: ");
    }
              }
}
            
      