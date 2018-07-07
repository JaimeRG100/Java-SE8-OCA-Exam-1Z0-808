class test {
  
  
  public static void main(String... args){
    
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder(1234);
    
    sb2 = new StringBuilder();
    sb2.append(true);
    sb2.append(121223);
    sb2.append("--");
    sb2.append(0.23);
    sb2.append("--234--",2,6);
    System.out.println(sb2);
    System.out.println("- - - - - - - -");
    
    sb2.delete(0,sb2.length());
    sb2.append("ABCDEFA");
    sb2.insert(1, "hello");
    System.out.println(sb2);
    sb2.insert(1, "012345", 1,4);
    System.out.println(sb2);
    System.out.println("- - - - - - - -");
    
    System.out.println("charAt: " + sb2.charAt(5));
    System.out.println("indexOf: " + sb2.indexOf("A"));
    System.out.println("indexOf: " + sb2.indexOf("A", 3));
    System.out.println("length: " + sb2.length());
    System.out.println("substring: " + sb2.substring(3,5));
    System.out.println("replace: " + sb2.replace(10,12,"-bye-"));
    System.out.println("subSequence: " + sb2.subSequence(10,15));
    sb2.setLength(2);
    System.out.println("setLength(after): " + sb2);
    
  }
  
}
