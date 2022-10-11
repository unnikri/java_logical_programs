/*write a java program that reads a integer and If the integer value is 1 then calculate area of the rectangle if the integer value is 2 then calculate whether year is leap year or not  and if the integer value is 3 then print average of 3 numbers. In all other cases print invalid number*/
import java.util.Scanner;

class Random{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number : ");
    int a=sc.nextInt();
    
    switch(a)
      {
        case 1:System.out.println("enter length ");
                int l=sc.nextInt();
                System.out.println("enter breath ");
                int b=sc.nextInt();
                int A=l*b;
                System.out.println("The area of rectangle is " +A);
                break;
        case 2:System.out.println("Enter a year ");
                 int year=sc.nextInt();
                 if(year%4==0||year%400==0)
                 {
                   System.out.println("The year is leapyear");
                 }
                else
                 {
                   System.out.println("The year is not leapyear ");
                 }
                break;
        case 3:System.out.println(" Enter first number ");
                 double first=sc.nextDouble();
                System.out.println(" Enter second number ");
                 double second=sc.nextDouble();
                   System.out.println(" Enter third number ");
                 double third=sc.nextDouble();
              double average=(first+second+third)/3;
            System.out.println("The average of three numbers are "+average);
          break;
      
        default:System.out.println("Wrong choice ");
  
      }
  }
}