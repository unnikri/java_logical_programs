import java.util.Scanner;
class scanner{
  public static void main(String[] args){
    int eno;
  String ename;
  int esa;
     Scanner sc=new Scanner(System.in);
       
     System.out.println("Enter Employee Number is ");
    eno=sc.nextInt();
    System.out.println("Enter Employee Name ");
    ename=sc.next();
    System.out.println("Enter Employee Salary ");
    esa=sc.nextInt();
     System.out.println("The Given Employee Number is "+eno);
    System.out.println("The Given Employee Name is "+ename);
    System.out.println("The Given Employee Salary is " +esa);
  }
}