import java.util.Scanner;
class vowel{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a value : ");
      char a =sc.next().charAt(0);
      if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
    {
      System.out.println(" Entered alphabet is a vowel");
    }
   else
      System.out.println(" Entered alphabet is not a vowel");
  }
}