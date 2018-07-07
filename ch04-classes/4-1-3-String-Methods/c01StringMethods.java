class c01StringMethods {
  
  public static void main(String... args) {
    // charAt      -\
    // indexOf       > Query position
    // substring   -/
    // trim        -\  modify
    // replace     -/
    // length      -\
    // startsWith  - > Othes
    // endsWith    -/
    
    // charAt()
    String name = new String("Paul");
    System.out.println(name);
    System.out.println("name.charAt(0): " + name.charAt(0));
    System.out.println("name.charAt(2): " + name.charAt(2));
    // System.out.println("name.charAt(4) " + name.charAt(4));   // StringIndexOutOfBoundsException
    System.out.println("- - - - - - - - ");
        
    // indexOf()
    String letters = "ABCAB";
    System.out.println(letters);
    System.out.println("letters.indexOf('B'): " + letters.indexOf('B'));
    System.out.println("letters.indexOf(\"S\"): " + letters.indexOf("S"));
    System.out.println("letters.indexOf(\"CA\"): " + letters.indexOf("CA"));
    System.out.println("letters.indexOf('B',2): " + letters.indexOf('B',2));
    System.out.println("- - - - - - - - ");
    
    // substring()
    String exam = "Oracle";
    String sub = exam.substring(2);
    System.out.println(exam);
    System.out.println("exam.substring(2): " + sub);
    String result = exam.substring(2,4);
    System.out.println("exam.substring(2,4): " + result);
    System.out.println("- - - - - - - - ");
    
    // trim()
    String varWithSpaces = " AB CB    ";
    System.out.print(":");
    System.out.print(varWithSpaces);
    System.out.println(":");
    System.out.print(":");
    System.out.print(varWithSpaces.trim());
    System.out.println(":");
    System.out.println("- - - - - - - - ");
    
    // replace()
    letters = "ABCAB";
    System.out.print(letters);
    System.out.println("letters.replace('B','b'): " + letters.replace('B','b'));
    System.out.println("letters.replace(\"CA\",\"12\"): " + letters.replace("CA","12"));
    //Won't compile:
    //System.out.println(letters.replace('B',"b"));   // You can't mix these ...
    //System.out.println(letters.replace("B",'b'));   // ... parameter types
    System.out.println(letters);
    System.out.println("- - - - - - - - ");
    
    // length()
    System.out.print("\"Shreya\".length(): ");
    System.out.println("Shreya".length());
    System.out.println("- - - - - - - - ");
    
    // startsWith()
    letters = "ABCAB";
    System.out.println("letters.startsWith(\"AB\"): " + letters.startsWith("AB"));
    System.out.println("letters.startsWith(\"a\"): " + letters.startsWith("a"));
    System.out.println("letters.startsWith(\"A\",3): " + letters.startsWith("A",3));
    
    // endsWith()
    System.out.println("letters.endsWith(\"CAB\"): " + letters.endsWith("CAB"));
    System.out.println("letters.endsWith(\"B\"): " + letters.endsWith("B"));
    System.out.println("letters.endsWith(\"b\"): " + letters.endsWith("b"));
    System.out.println("- - - - - - - - ");
    
    // concat()
    System.out.println("Method chaining 1: ");
    String result2 = "Sunday  ".replace(' ', 'Z').trim().concat("M n");
    System.out.println(result2);
    System.out.println("- - - - - - - - ");
    
    // Method chaining
    System.out.println("Method chaining 2: ");
    String day = "SunDay";
    day.replace('D', 'Z').substring(3);
    System.out.println(day);
    day = day.replace('D', 'Z').substring(3);
    System.out.println(day);
    System.out.println("- - - - - - - - ");
    
    System.out.println("Twist In the Tale 4.1: ");
    letters = "ABCAB";
    //System.out.println(letters.substring(0, 2).startsWith('A'));
    //Compilation error
    
  }
 
}