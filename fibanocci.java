import java.util.Scanner;
class fibanocci{
  public static void main(String args[]){
    int n,f1=1,f2=0,f3=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value ");
    n=sc.nextInt();
    while(n>0)
      {
        System.out.println("\t"+f3);
        f3=f1+f2;
        f1=f2;
        f2=f3;
        n--;
      }
    sc.close();
  }
}