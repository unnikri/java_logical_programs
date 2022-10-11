import java.util.*;
class palindromeString{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String st1= new String();
   // st1.append(scanner.nextLine());
 // StringBuffer st1=new StringBuffer("malayalam");
  /*  String st1="malayalam";
    String st2=null;
    String st2=new String(st1);
  for(int i=st1.length();i>0;i--)
  {
  st2=st1.charAt(i-1);
  }
    System.out.println(st1.equalsIgnorCase(st2));
/*if(st1==st2)
  System.out.println("palindrome");
    else
  System.out.println("not palindrome");
   System.out.println(st1.reverse());*/
    if(st1.reverse()==st1)
    {
      System.out.println("palidrome");
    
    }
    else
    {
      System.out.println("not palidrome");
    }

}
}