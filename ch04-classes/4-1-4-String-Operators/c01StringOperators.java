class c01StringOperators {
  public static String str;
  
  public static void testString() {
    System.out.println("String Class initialized to: " + str);
    str += "hello";
    System.out.println("String Class: " + str);
    str = "";
    System.out.println("String Class: " + str);
  }
  
  public static void main(String args[]) {
    
    String aString = "OCJA"+"Cert"+"Exam";
    int num = 10;
    int val = 12;
    String aStr = ":OCJA";
    String anotherStr = num + val + aStr;
    System.out.println(anotherStr);
    
    anotherStr = "" + num + val + aStr;
    System.out.println(anotherStr);
    
    String lang = "Java";
    lang += " is everywhere!";
    String initializedToNull = null;
    //initializedToNull += "Java";
    System.out.println(initializedToNull);
    
    c01StringOperators.testString();
  }
}