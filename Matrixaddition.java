import java.util.*;
class Matrixaddition{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r1,c1,r2,c2,i,j;
    System.out.println("Enter row size for first matrix :");
    r1=sc.nextInt();
    System.out.println("Enter coloum size for first matrix :");
    c1=sc.nextInt();
     System.out.println("Enter row size for second matrix :");
    r2=sc.nextInt();
    System.out.println("Enter coloum size for second matrix :");
    c2=sc.nextInt();
     
    int a[][]=new int[r1][c1];
     int b[][]=new int[r2][c2];
     int c[][]=new int[r1][c2];
     if(r1==r2&&c1==c2)
    {
    System.out.println("Enter the elements of the first matrix :");
    for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
          {
            a[i][j]=sc.nextInt();
          }
      }
      System.out.println("The elements of the first matrix is ");
      for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
          {
            System.out.print("\t"+a[i][j]);
          }
        System.out.println();
      }

      System.out.println("Enter the elements of the second matrix :");
    for(i=0;i<r2;i++)
      {
        for(j=0;j<c2;j++)
          {
            b[i][j]=sc.nextInt();
          }
      }
      System.out.println("The elements of the second matrix is ");
      for(i=0;i<r2;i++)
      {
        for(j=0;j<c2;j++)
          {
           System.out.print("\t"+b[i][j]);
          }
        System.out.println();
      }

       System.out.println("The addition of two matrix are :");
    for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
          {
            c[i][j]=a[i][j]+b[i][j];
          }
         
      }
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              System.out.print("\t"+c[i][j]);
            }
          System.out.println();
        }
     
   }
     else
     {
       System.out.println("invalid row and coloum :");
     }
   }
}
     



