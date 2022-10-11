//to find the index position
/*import java.util.Scanner;
class IndexOf{
  public static void main(String[] args){
    char ch;
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any word ");
     str=sc.nextLine();
    System.out.println("Enter the character to check");
    ch=sc.next().charAt(0);
    int index=str.indexOf(ch);
    System.out.println("The index position of the given word is "+index);
  }
}
*/


//program to find the last index position
/*import java.util.Scanner;
class IndexOf{
  public static void main(String[] args){
    char ch;
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any word ");
     str=sc.nextLine();
    System.out.println("Enter the character to check");
    ch=sc.next().charAt(0);
    int index=str.lastIndexOf(ch);
    System.out.println("The index position of the given word is "+index);
  }
}*/

/*
//programt to find all the index postion of particular number

import java.util.Scanner;
class IndexOf{
  public static void main(String[] args){
    char ch;
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any word ");
     str=sc.nextLine();
    System.out.println("Enter the character to check");
    ch=sc.next().charAt(0);
    int index=str.lastIndexOf(ch);

  int count=0;
    for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)==ch)
        {
           System.out.println("The entered charcter is present at the position" +str.indexOf(i));
          count ++;
       
          }
        
      }
    System.out.println("The total number of character is "+count);
  }
}

*/
//Program to find word count

import java.util.Scanner;
class IndexOf{
  public static void main(String[] args){
  
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any word ");
     str=sc.nextLine();

    String [] words=str.split(" ");
    int count=0;
  for(String word:words)
    {
    count++;
    }
        System.out.println("word count "+count);
      
  }
}