//N natural numbers using do while loop
import java.util.Scanner;
class dowhile{
  public static void main(String args[]){
    int n,i=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value ");
    n=sc.nextInt();
    do
      {
        System.out.print("\t" +i);
        i++;
      }while(i<=n);
      sc.close();
  }
}