class NumberFormarExc {
  public static void main(String args[]) {
    System.out.println(Integer.parseInt("-123"));    
    System.out.println(Integer.parseInt("123"));
    System.out.println(Integer.parseInt("+123"));
    try {
      System.out.println(Integer.parseInt("123_45"));  // throw NumberFormatException
    }
    catch (java.lang.NumberFormatException e) {
      System.out.println(e);
    }
    try {
      System.out.println(Integer.parseInt("12ABCD"));  // throw NumberFormatException
    }
    catch (java.lang.NumberFormatException e) {
      System.out.println(e);
    }
    System.out.println(Integer.parseInt("12ABCD",16));
  }
  
}