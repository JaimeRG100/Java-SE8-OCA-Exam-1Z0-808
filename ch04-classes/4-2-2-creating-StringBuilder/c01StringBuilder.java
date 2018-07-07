class c01StringBuilder {
    
  public static void main(String args[]) {    
    
    StringBuilder sb1 = new StringBuilder();      // initial capacity of 16 characters
    StringBuilder sb2 = new StringBuilder(sb1);
    StringBuilder sb3 = new StringBuilder(50);    // Specifies the initial capacity
    StringBuilder sb4 = new StringBuilder("Shreya Gupta");
    
    System.out.println("sb1: " + sb1);
    System.out.println("sb2: " + sb2);
    System.out.println("sb3: " + sb3);
    System.out.println("sb4: " + sb4);
    System.out.println("- - - - - - - ");
    
    System.out.println("sb1.length(): " + sb1.length());
    System.out.println("sb2.length(): " + sb2.length());
    System.out.println("sb3.length(): " + sb3.length());
    System.out.println("sb4.length(): " + sb4.length());
    System.out.println("- - - - - - - ");
    
  }
}