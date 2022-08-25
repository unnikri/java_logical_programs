import java.util.Scanner;
class vowel{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Alphabet : ");
      char a =sc.next().charAt(0);
      if (a=='a'||a=='A')
      {
        System.out.println(" Entered character is vowel ");
        
      }
        else if (a=='e'||a=='E')
      {
        System.out.println(" Entered character is vowel ");
        
      }
       else if (a=='i'||a=='I')
      {
        System.out.println(" Entered character is vowel ");
        
      }
         else if (a=='o'||a=='O')
      {
        System.out.println(" Entered character is vowel ");
        
      }
        else if (a=='u'||a=='U')
      {
        System.out.println(" Entered character is vowel ");
        
      }
    else
          {
            System.out.println(" It is a consonant");
  }
}
}