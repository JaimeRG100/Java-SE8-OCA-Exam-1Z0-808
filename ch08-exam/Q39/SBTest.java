class SBTest {
  public static void main(String ... args){
    StringBuilder sb1 = new StringBuilder();
    System.out.println(sb1.insert(0,"a"));
    
    
    // test code
    System.out.println(sb1.insert(0,"b"));
    StringBuilder sb2 = new StringBuilder(5*10);
    System.out.println(sb2);
    //System.out.println(sb1.insert(5,"z"));  // StringIndexOutOfBoundsException
    
  }
}