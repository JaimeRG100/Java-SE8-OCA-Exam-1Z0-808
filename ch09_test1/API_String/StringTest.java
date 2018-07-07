class StringTest {
  static String instanceTest;  
  
  public static void main(String ... args) {
    String str1 = new String("hello");
    String str2 = new String("hello");
    System.out.println(str1 == str2);
    String str3 = "hello";
    String str4 = "he" + "llo";
    System.out.println(str3 == str4);
    System.out.println(str1.equals(str4));
    System.out.println("- - - - - ");
    System.out.println(str1.length());
    System.out.println(str1.concat(" world"));
    System.out.println(str1);
    System.out.println(str1.substring(1,3));
    System.out.println("- - - - - ");
    changeStr(str1);
    System.out.println(str1);   
    System.out.println("- - - - - ");
    char[] name = new char[] {'P','a','u','l'};
    str4 = new String(name);
    System.out.println(str4);
    System.out.println("- - - - - ");
    str4 = "  hello     world  !      ";
    System.out.println(":" + str4.trim() + ":");
    String test;
    //System.out.println(test);  // Error: variable test might not have been initialized
    System.out.println(instanceTest);
    System.out.println("- - - - - ");
    String strArray[] = new String[8];
    for (String s : strArray){
      System.out.print(s + ", ");
    }
    System.out.println();
    System.out.println("- - - - - ");
    str4 = "Paul";
    System.out.println(str4.replace("au","AU"));
    System.out.println(str4.replace('a','@'));
    System.out.println(str4);
    System.out.println("- - - - - ");
    System.out.println(str4.startsWith("P"));
    System.out.println(str4.endsWith("P"));
    System.out.println("- - - - - ");
  }
  
  public static void changeStr(String ref) {
    ref = ref.concat(" World of Java 8");
    System.out.println(ref);
  }
  
}