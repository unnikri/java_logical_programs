import java.util.Scanner;
class weekday{
  public static void main(String args[]){
    int a;
    Scanner num= new Scanner(System.in);
    System.out.println("enter the day ");
    a=num.nextInt();
    if(a==1)
    {
      System.out.println("Enter entered day is Monday");
    }
    else if (a==2)
    {
      System.out.println("Enter entered day is Tuesday");
    }
    else if(a==3)
    {
      System.out.println("Enter entered day is Wednesday");
    }
    else if (a==4)
    {
      System.out.println("Enter entered day is Thursday");
    }
    else if (a==5)
    {
      System.out.println("Enter entered day is Friday");
  }
    else if (a==6)
    {
      System.out.println("Enter entered day is Saturday");
        }
        else if (a==7)
    {
      System.out.println("Enter entered day is Sunday");
    }
    else
          System.out.println("Incorrect entry ");
    }
  
}
