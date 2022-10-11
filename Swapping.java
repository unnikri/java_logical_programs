12/*  JFM1T2_Assignment6:

    Write a program that swaps the values of 2 variables without using third variable.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    12
    Enter second number: 
    45
    
    Expected Output:
    Before swapping: 12 , 45
    After swapping: 45 , 12
*/

//import statements for java program to read inputs using Scanner class
<<<<<<< HEAD
import java.util.Scanner;
class Swapping{
  public static void main(String args[]){
    int a;
    int b;
    Scanner num= new Scanner(System.in);
    System.out.println("enter the a value ");
    a=num.nextInt();
    System.out.println("enter the b value");
    b=num.nextInt();
    System.out.println("Before swapping");
    System.out.println(" a="+a);
    System.out.println(" b="+b);
    System.out.println(" ");
    a=a-b;
    b=a+b;
    a=b-a;
    System.out.println("After swapping");
    System.out.println(" a="+a);
    System.out.println(" b="+b);
  
    
  }
}
=======
import java.util.Scanner;

class Swapping{
  public static void main(String args[]){
    int a;
    int b;
    int temp=0;
    Scanner num= new Scanner(System.in);
    System.out.println("enter first number ");
    a=num.nextInt();
    System.out.println("enter second number");
    b=num.nextInt();
    System.out.print("Before swapping: ");
    System.out.print(" "+a);
    System.out.println(" , "+b);
    System.out.println(" ");
    temp=a;
    a=b;
    b=temp;
    System.out.print(" After swapping: ");
    System.out.print(" "+a);
    System.out.println(" , "+b);
>>>>>>> c7b8a82f5940d5cea3a0a048429d3a311da13088
//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//swapping two numbers without using third variable

//print result

<<<<<<< HEAD
=======
}
}

//without using temporary variable you need to perform the task.
>>>>>>> c7b8a82f5940d5cea3a0a048429d3a311da13088
