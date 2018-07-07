class c01CompareStrings {
  
  public static void main(String args[]) {
    
    String str1 = new String("Paul");
    String str2 = new String("Paul");    
    System.out.println(str1 == str2);        // Prints false
    
    String str3 = "Harry";
    String str4 = "Harry";
    System.out.println(str3 == str4);        // Prints true
    
    String morning1 = "Morning";                 // String constant pool
    System.out.println("Morning" == morning1);   // Prints true
    
    String morning2 = new String("Morning");
    System.out.println("Morning" == morning2);   // Prints false
    
    // String constructor accepts a char array
    String girl = new String("Shreya");
    char[] name = new char[] {'P','a','u','l'};
    String boy = new String(name);
    
    // String constructor accepts a StringBuilder and StringBuffer
    StringBuilder sb1 = new StringBuilder("String Builder");
    String str5 = new String(sb1);
    StringBuffer sb2 = new StringBuffer("String Buffer");
    String str6 = new String(sb2);
    
    String empName = null;
    
    
    
    
    /*
    System.out.println(boy.equals(new String("Paul")));  //true
    
    System.out.println(str5.equals("String Builder"));   //true
    
    String strA = new String(null);  // not valid
    
    String strB = null;
    System.out.println(strB == null);  //true
    */
    
  }
}