class ReturnString {
  
  /*
  public String addV1(String 1, String 2) {
    return a1 + a2;
  }
  */
  
  private String addV2(String s1, String s2) {
    return s1.concat(s2);
  }
  
  /*
  protected String addV3(String value1, String value2) {
    return value2.append(value2);
  }
  */
  
  String substract(String first, String second) {
    return first.concat(second.substring(0));
  }
  
  public static void main(String... args) {
    
    ReturnString rs = new ReturnString();
    //System.out.println(rs.addV1("Hello", "_world!"));
    System.out.println(rs.addV2("Hello", "_world!"));
    //System.out.println(rs.addV3("Hello", "_world!"));
    System.out.println(rs.substract("Hello", "_world!"));
    
    //test code
    System.out.println(rs.substract("",""));
  }
}