class c01StringBuildermethods {
    
  public static void main(String args[]) {    
    
    // charAt     \
    // indexOf     > Query
    // substring  /
    // append     \
    // insert      > Modify
    // delete     /
    // length     \ 
    // trimToSize  > Others
    // setLength  /
    System.out.println("- - - - - - - ");
    
    // APPEND
    StringBuilder sb1 = new StringBuilder();
    sb1.append(true);
    sb1.append(19);
    sb1.append('a');
    sb1.append(20.99);
    sb1.append("Hi");
    System.out.println(sb1);
    
    // You can append a complete char array 
    char[] name = {'J', 'a', 'v', 'a', '8'};
    sb1 = new StringBuilder();  //clear StringBuilder
    sb1.append(name, 1, 3);
    System.out.println(sb1);
    System.out.println("- - - - - - - -");
    
    
    // APPEND(OBJECT)
    sb1 = new StringBuilder();
    sb1.append("Java");
    sb1.append(new Person("Oracle"));
    System.out.println(sb1); // Doesn't print JavaOracle, if the method toString() haven't been overriden
    System.out.println("- - - - - - - -");
    
    
    // INSERT
    sb1 = new StringBuilder("Bon");
    sb1.insert(2,"r");
    System.out.println(sb1);  
    
    // You can also insert a complete char array
    sb1 = new StringBuilder("123");
    char[] name2 = {'J', 'a', 'v', 'a'};
    sb1.insert(1, name2, 1, 3);
    System.out.println(sb1);
    
    //It also append String, but take note on the end index (differ from char array)
    sb1.insert(1, "Java", 1,3);
    System.out.println(sb1);
    System.out.println("- - - - - - - -");
    
    
    // DELETE
    sb1 = new StringBuilder("0123456");
    sb1.delete(2,4);
    System.out.println("sb1: <" + sb1 + ">");
    sb1.delete(0,sb1.length());
    System.out.println("sb1: <" + sb1 + ">");
    sb1.delete(0,sb1.length());
    
    
    // DELETECHARAT
    sb1 = new StringBuilder("0123456");
    sb1.deleteCharAt(2);
    System.out.println("sb1: " + sb1);
    System.out.println("- - - - - - - -");
    
    
    // TRIM
    // no trim method like String
    
    
    // REVERSE
    sb1 = new StringBuilder("0123456");
    sb1.reverse();
    System.out.println("sb1: " + sb1);
    System.out.println("- - - - - - - -");
    
    // REPLACE
    sb1 = new StringBuilder("0123456");
    sb1.replace(2, 4, "ABCD");
    System.out.println("sb1: " + sb1);
    System.out.println("- - - - - - - -");
    
    
    // SUBSEQUENCE
    sb1 = new StringBuilder("0123456");
    System.out.println("subSequence: " + sb1.subSequence(2, 4));
    System.out.println("sb1: " + sb1);
    System.out.println("- - - - - - - -");

  }
}



// only used for APPEND(OBJECT)
class Person {
  String name;
  
  Person(String str) { name = str; }
  
  public String toString(){
    return name;
  }
}