import java.util.Scanner;

class evenOdd{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter A value: ");
    int a=sc.nextInt();
   
          
    if (a%2==0)
    {
      System.out.println("A is Even");
      
    }
    else
    System.out.println("A is odd");
  }
  
}