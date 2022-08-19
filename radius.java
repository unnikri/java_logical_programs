import java.util.Scanner;
class radius
{
  public static void main(String[] args)
  {
    int r;
    double pi=3.14;
    double ar;
Scanner ra=new Scanner(System.in);
System.out.println("Enter the radius of the circle ");
r=ra.nextInt();
ar=pi*r*r;
 System.out.println("The area of the circle is "+ar);
  
  }
}