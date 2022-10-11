import java.util.Scanner;
  class currentBill
  {
    public static void main(String args [])
    {
      int cno;
      String cname;
      double pmonth;
      double lmonth;
      double bill;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the consumer Number is:");
      cno=sc.nextInt();
      System.out.println("Enter the consumer  Name is:");
      cname=sc.next();
      System.out.println("present month reading is:");
      pmonth=sc.nextDouble();
      System.out.println("Last month reading is:");
      lmonth=sc.nextDouble();
    double tu=pmonth-lmonth;
      if (tu<=50)
      
        bill=tu*3.40;
      else if (tu<=100)
        bill =(50*3.40)+((tu-50)*4.56);
      else if (tu<=200)
        bill =(50*3.40)+(50*4.56)+((tu-100)*5.43);
      else if (tu<=300)
        bill=(50*3.40)+(50*4.56)+(100*5.43)+((tu-100)*6.54);
    
       else 
        bill=(50*3.40)+(50*4.56)+(100*5.43)+(100*6.54)+(tu*7.54);
    
      
      System.out.println("Consumer Number is:"+cno);
      System.out.println("Consumer Name is:"+cname);
      System.out.println("present month reading is:"+pmonth);
      System.out.println("Last month reading is:"+lmonth);
      System.out.println("Generated bill is:"+bill);
    }
  }