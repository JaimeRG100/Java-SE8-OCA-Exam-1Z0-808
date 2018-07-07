class TwisInTheTale7_5  {
  
  public static void main(String[] args) {
    String [][] oldLaptops = {
      {"Dell", "Toshiba", "Vaio"},
      null,
      {"IBM"},
      new String[10]};
    
    System.out.println(oldLaptops[0][0]);         // Dell
    System.out.println(oldLaptops[1]);            // null
    System.out.println(oldLaptops[3][6]);         // null
    System.out.println(oldLaptops[3][0].length());// NullPointer
    System.out.println(oldLaptops);               // ref{}
  }
}