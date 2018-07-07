class BooleanWC{
  
  public static void main(String[] args) {
    Boolean b1 = new Boolean(true);
    Boolean b2 = new Boolean(false);
    if(b1==b2) 
      System.out.println("true1 ==");
    b1 = null;
    b2 = null;
    if(b1==b2) 
      System.out.println("true2 ==");
    
    b1 = Boolean.valueOf("true");
    b2 = Boolean.valueOf("TRUE");
    if(b1==b2) 
      System.out.println("true3 ==");
  }
  
}