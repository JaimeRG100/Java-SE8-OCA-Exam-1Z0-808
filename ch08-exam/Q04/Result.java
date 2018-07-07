class Student { int marks = 10; }

public class Result {
  public static void main(String... args) {
    Student s = new Student();
    switch (s.marks) {
      default: System.out.println("100");
      case 10: System.out.println("10");
      case 98: System.out.println("98");
    }
    
    // test code
    System.out.println("- - - - - ");
    switch (37) {
      default: System.out.println("100");
      case 10: System.out.println("10");
      case 98: System.out.println("98");
    }
  }
}