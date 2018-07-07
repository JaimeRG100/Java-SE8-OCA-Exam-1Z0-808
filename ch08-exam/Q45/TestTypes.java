class TestTypes {
  public static void main(String args[]) {
    Byte b1 = (byte)100;
    Integer i1 = 200;
    Long l1 = (long) 300000;
    // Fail to compile starting from here
    Float f1 = (float)b1 + ( 0int)i1;
    String s1 = 300;
    if (s1 == (b1 + i1))
      s1 = (String) 500;
    else
       f1 = (int) 100;
    System.out.println(s1 + ":" + f1);
    
  }
}