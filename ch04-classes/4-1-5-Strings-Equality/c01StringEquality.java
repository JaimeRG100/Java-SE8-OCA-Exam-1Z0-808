class c01StringEquality {
    
  public static void main(String args[]) {
    
    //Comparing Reference Variables to Instance Values
    String var1 = new String("Java");
    String var2 = new String("Java");
    System.out.println(var1.equals(var2));  // true
    System.out.println(var1 == var2);       // false
    System.out.println("- - - - - - - ");
    
    String var3 = "code";
    String var4 = "code";
    System.out.println(var3.equals(var4));  // true
    System.out.println(var3 == var4);       // true
    System.out.println("- - - - - - - ");
    
    var1 = new String("Java");
    var2 = new String("Java");
    System.out.println(var1.equals(var2));  // true
    System.out.println(var1 == var2);       // false
    System.out.println(var1 != var2);       // true
    System.out.println("- - - - - - - ");
    
    var3 = "code";
    var4 = "code";
    System.out.println(var3.equals(var4));  // true
    System.out.println(var3 == var4);       // true
    System.out.println(var3 != var4);       // false
    System.out.println("- - - - - - - ");
    
    //Equality of Values Returned by String Method
    String lang1 = "Java";
    String lang2 = "JaScala";
    String returnValue1 = lang1.substring(0,1);
    String returnValue2 = lang2.substring(0,1);
    System.out.println(returnValue1 == returnValue2);      // false
    System.out.println(returnValue1.equals(returnValue2)); // true
      
    
    
    
    
  }
}