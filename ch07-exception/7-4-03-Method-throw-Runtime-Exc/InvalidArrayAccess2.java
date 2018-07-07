public class InvalidArrayAccess2 {
  public static void main(String args[]) {
    String[] students = {"Shreya", "Joseph"};
    try {
      System.out.println(students[5]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exceptions");
    }
    System.out.println("All seems to be well");    
  }
}