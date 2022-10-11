import java.util.Scanner;
class armstrong{
  public static void main(String args[]){
    int num,n, digit,sum=0,number;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the  value ");
     n=sc.nextInt();
  
    for(int i=1;i<=n;i++)
      {
        number=i;
        sum=0;
        digit=0;
        num=number;
    while(number>0)
      {
        digit=number%10;
        sum=sum+digit*digit*digit;
        number=number/10;
      }
      
    if(sum==num)
     {
      System.out.println("The armstrong numbers are " +num);
      
     }
   }

  }
  
}