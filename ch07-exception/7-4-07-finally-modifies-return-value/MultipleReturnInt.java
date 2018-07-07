public class MultipleReturnInt {
  public static void main(String[] args) {
    int i = getInt();
    System.out.println("[main] Returned value: " + i);
  }
  
  static int getInt() {
    int returnVal = 10;
    try {
      String students[] = {"Harry", "Joseph"};
      System.out.println(students[5]);      
    } 
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("[catch] About to return: " + returnVal);
      return returnVal;
    }
    finally {
      returnVal += 10;
      System.out.println("[finally] Return value is now: " + returnVal);
    }
    
    return returnVal;
    
  }
}
