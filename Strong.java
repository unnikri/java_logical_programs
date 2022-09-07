import java.util.Scanner;
class Strong{
  public static void main(String args[]){
    int number,num,digit=0,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value :");
    number=sc.nextInt();
    num=number;
    while(number>0)
      {
        digit=number%10;
        int fact=fact(digit);
        sum=sum+fact;
        number=number/10;
      }
    if(sum==num)
    {
      System.out.println("The entered number is Strong number ");
  }
    else
    {
      System.out.println("The entered number is Not a  Strong number ");
    }
  }//main ends
    static int fact(int r)
      {
      int mul=1;
      for(int i=1;i<=r;i++)
        {
          mul=mul*i;
        }
     return mul;
}//method ends
}//class ends
