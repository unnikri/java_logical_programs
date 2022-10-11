class countAlphabet{
  public static void main(String args[]){
    String st1="Hello123$&#";
    char ch;
    int alphabet=0;
     int small=0;
    int digit=0;
    int special=0;
    for(int i=0;i<st1.length;i++)
      {
        ch=st1.charAt(i);
    if(ch>='a'&&ch<='z')
    {
      alphabet++;
      System.out.print("no of Small letter alphabets are "+alphabet);
    }
    elseif(ch>='A' &&ch<='Z');
      {
      small++;
      System.out.println("no of The capital letter alphabets are "+small);
      }
    elseif(ch>=0 && ch<=9);
      {
      digit++;
      System.out.println("no of  digits are "+digit);
      }
        else
        {
          special++;
          System.out.println("The number of special charcters are "+ special);
        }
      }
  }
}