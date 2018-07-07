public class Student {
  private String fName;
  private String lName;
  
  public Student(String first, String last) {
    fName = first; lName = last;
  }
  
  public String getName() { return fName + " " + lName; }
}