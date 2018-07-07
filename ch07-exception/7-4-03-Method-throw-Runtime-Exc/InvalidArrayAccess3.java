public class InvalidArrayAccess3 {
  public static void main(String args[]) {
    String[] students = {"Shreya", "Joseph"};
    int pos = 10;
    if (pos > 0 && pos < students.length)
      System.out.println(students[pos]);
    System.out.println("All seems to be well");    
  }
}