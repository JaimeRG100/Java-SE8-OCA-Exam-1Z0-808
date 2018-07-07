public class MultipleReturnObj {
  public static void main(String[] args) {
    
    System.out.println("[main] Returned value: " + getStringBuilder());
  }
  
  static StringBuilder getStringBuilder() {
    StringBuilder returnVal = new StringBuilder("10");
    try {
      String students[] = new String[] {"Students", "Joseph"};
      System.out.println(students[5]);
    }
    catch (Exception e) {
      System.out.println("[catch] About to return: " + returnVal);
      return returnVal;
    }
    finally {
      returnVal.append("10");
      System.out.println("[finally] Return value is now: " + returnVal);
    }
    return returnVal;
  }
}
