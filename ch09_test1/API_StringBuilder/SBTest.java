class SBTest {
  
  public static void main(String ... args) {
    
    //STRING ARE IMMUTABLE
    final String strFinal = new String("I'm a final String, you can't change me");
    System.out.println(strFinal);
    // strFinal = "bye";   // Error: cannot assign a value to final variable strFinal
    final StringBuilder sbFinal = new StringBuilder("hello ... ");
    System.out.println(sbFinal);
    sbFinal.append("world Java8");
    System.out.println(sbFinal);
    System.out.println("- - - - -");
    StringBuilder sb = new StringBuilder("" + 5.23 + true);
    System.out.println(sb);
    //sb = new StringBuilder("" + true + 5); // < err 
    sb = new StringBuilder("" + true + 5);
    System.out.println("- - - - -");

    
    /* QUERY:     charAt,  indexOf,      substring
     * MODIFY:    append,  insert,      delete      deleteCharAt     reverse
     * OTHER:     length,  trimToSize,  setLength   */
    sb = new StringBuilder("0123456789");
    sb.append("-hello");
    sb.append("-hello",0,1);
    char[] neim = new char[] {'J','a','v','a','8'};
    sb.append(neim);
    sb.append(0.896d);
    sb.append(true);
    System.out.println(sb);
    System.out.println("- - - - -");
    System.out.println(sb.charAt(2));
    System.out.println(sb.indexOf("-hello"));
    System.out.println("- - - - -");
    sb.insert(0, "FIRST:");
    System.out.println(sb);
    sb.insert(0, "[ENCLOSE]:",0,1);
    System.out.println(sb);
    System.out.println("- - - - -");
    sb.delete(0, sb.length());
    System.out.println(":"+sb+":");
    System.out.println("- - - - -");
    sb = new StringBuilder().append("HAHAH");
    System.out.println(sb);
    sb.delete(0,sb.length());
    System.out.println("- - - - -");
    sb.append("0123ABCD");
    sb.setLength(3);
    System.out.println(sb);
    sb.deleteCharAt(0);
    System.out.println(sb);
    sb.append(3456);
    sb.reverse();
    System.out.println(sb);
    System.out.println("- - - - -");
    System.out.println("before: " + sb);
    sb = new StringBuilder(sb);
    System.out.println("after: " + sb);
    sb.append(sb);
    System.out.println("append: " + sb);
    System.out.println("- - - - -");
    sb.replace(2,8,"");
    System.out.println("replaced: " + sb);
    System.out.println(sb.subSequence(1,3));
    System.out.println(sb);
    System.out.println("- - - - -");
    System.out.println(sb.substring(0,3));
    System.out.println(sb);
    
    
  }
}