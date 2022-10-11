class reverseStringWithoutmethod{
  public static void main(String args[]){
    String st1=" WELCOME TO KERALA";
  //  char ac[]=st1.toCharArray();
  //  String txt[]=st1.split(" ");
    for(int i=st1.length();i>0;i--)
      {
    System.out.println(st1.charAt(i-1));
  }
}
}
