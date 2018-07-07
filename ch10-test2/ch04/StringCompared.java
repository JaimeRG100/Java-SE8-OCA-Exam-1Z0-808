class StringCompared {
  
  
  public static void main(String... arg) {
    
    String str1 = new String ("Paul");
    String str2 = new String ("Paul");
    System.out.print("str1 == str2: ");
    System.out.println(str1 == str2);
    
    String str3 = "Paul";
    String str4 = "Paul";
    System.out.print("str3 == str4: ");
    System.out.println(str3 == str4);
    
    String str5 = "Morning";
    System.out.print("str5 == \"Morning\": ");
    System.out.println(str5 == "Morning");
    
    String str6 = new String("Morning");
    System.out.print("str6 == \"Morning\": ");
    System.out.println(str6 == "Morning");
    
    
    String girl = new String("Shreya");           //String
    char[] name = new char[] {'P','a','u','l'};
    String boy = new String(name);                //Array of char
    
    String myString = new String("hello" + 5 * 3.5 );
    System.out.println(myString);
    myString = new String(5 * 3.5  + "hello");
    System.out.println(myString);
    
  }
}