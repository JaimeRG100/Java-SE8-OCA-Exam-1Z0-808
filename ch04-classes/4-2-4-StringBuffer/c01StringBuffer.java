class c01StringBuffermethods {
    
  public static void main(String args[]) {    
    
    // charAt     \
    // indexOf     > Query
    // substring  /
    // append     \
    // insert      > Modify           ->  StringBuffer are Synchonized for Threads
    // delete     /
    // length     \ 
    // trimToSize  > Others
    // setLength  /
    System.out.println("- - - - - - - ");
    
    // APPEND
    StringBuffer sb1 = new StringBuffer();
    sb1.append("0123456", 0, 6);
    sb1.append(70 + 8);
    System.out.println(sb1);
    
    // You can append a complete char array 
    char charArray[] = {'J','A','V','A','8'};
    sb1.append(charArray, 1,4);
    System.out.println(sb1);
    
    // APPEND(OBJECT)
    sb1.append(":");
    sb1.append(new Person("Paul"));
    System.out.println(sb1);
    
    // INSERT
    sb1 = new StringBuffer("0123456");
    sb1.insert(4, charArray, 0, 3);
    System.out.println(sb1); 
    sb1.insert(4, "JAVA8", 0, 3);
    System.out.println(sb1); 
    
    // You can also insert a complete char array
    sb1 = new StringBuffer("0123456");
    sb1.insert(4, new char[] {'j','a','v','a'}, 0, 3);
    System.out.println(sb1); 
    
    // DELETE
    sb1 = new StringBuffer("0123456");
    sb1.delete(3,5);
    System.out.println(sb1); 
    
    // DELETECHARAT
    sb1.deleteCharAt(2);
    System.out.println(sb1); 
    
    // TRIM
    // no trim method
    
    
    // REVERSE
    sb1.reverse();
    System.out.println(sb1); 
    
    // REPLACE
    sb1 = new StringBuffer("0123456");
    sb1.replace(3,5, "hello");
    System.out.println(sb1);
    
    // SUBSEQUENCE
    sb1 = new StringBuffer("0123456");
    System.out.println(sb1.subSequence(3,5));
    System.out.println(sb1);

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