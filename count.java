class count
    {
      public static void main(String args[]){
        
        String st1=new String("UNNIKRISHNANPS"+"\0");
        
        int count=0;
        for(int i=0;st1.charAt(i)!='\0';i++)
          {
            count++;
          }
        System.out.println("The length of the given String is "+count);      
    
}
}