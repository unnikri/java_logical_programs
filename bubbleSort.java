import java.util.*;
class bubbleSort{
  public static void main(String args[])
   {
    int n,i,j,t;
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size ");
      n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the array elements ");
    for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
    System.out.println("The elements before swapping  are ");
      
    for(i=0;i<n;i++)
      {
        System.out.print(a[i]+"\t" );
        }
     System.out.println("\n");
    System.out.println("The elements after sort is ");
    for(i=0;i<n-1;i++){
      for(j=0;j<n-1-i;j++)
        {
          if(a[j]>a[j+1])
          {
            t=a[j+1];
            a[j+1]=a[j];
            a[j]=t;
          }
        }
       
    }
     for(i=0;i<n;i++)
       
     System.out.print(a[i]+"\t" );
    
      }
      
  }
