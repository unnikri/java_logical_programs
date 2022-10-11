/*  JFM1T2_Assignment3:

     Print the results for the following statements considering x = true and y = false
             1. x&&y
             2. x||y
             3. !x
             4. !y
     Prompt the user input from the terminal.
             
     Sample Input:
     Enter x as boolean value(true/false): 
     true
     Enter y as boolean value(true/false): 
     false
     
     Expected Output:
     x&&y is: false
     x||y is: true
     !x is: false
     !y is: true

*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class BooleanOperation {
  public static void main(String args[]){
    
  
//main method

/*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/boolean x=true;
  boolean y=false;
    
Scanner sc=new Scanner(System.in);
  System.out.println("enter x as boolean value(True/false) ");
 x=sc.nextBoolean();
System.out.println("enter y as boolean value(True/false) ");
 y=sc.nextBoolean();
boolean z=true && false;
boolean a=true || false;
boolean b= !x;
boolean c= !y;

/*Take input from user
  System.out.println("Enter x as boolean value(true/false): ");
  boolean x=sc.nextBoolean();
*/
System.out.println("x&&y is :"+z);
    System.out.println("x||y is :"+a);
    System.out.println("!x is :"+b);
    System.out.println("!y is :"+c);
//print apppropriate result for boolean operations

}
}