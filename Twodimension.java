/*class Twodimension{
  public static void main(String args[]){
    int a[][]={{10,20,30},{40,50,60},{70,80,90}};
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
          {
            System.out.print(" " +a[i][j]);
          }
        System.out.println();
      }
  }
}*/

import java.util.Scanner;
class Twodimension{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r1,c1,i,j;
    System.out.println("Enter row size :");
    r1=sc.nextInt();
    System.out.println("Enter coloum size :");
    c1=sc.nextInt();
    int a[][]=new int[r1][c1];
    System.out.println("Enter the elements in the matrix :");
    for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
          {
            a[i][j]=sc.nextInt();
          }
      }
    System.out.println("The elements in the array are ");
      for(i=0;i<r1;i++)
      {
        for( j=0;j<c1;j++)
          {
            System.out.print(" " +a[i][j]);
          }
        System.out.println();
      }
  }
}
