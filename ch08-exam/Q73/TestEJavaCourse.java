class Course {
  static int enrollments;
}

public class TestEJavaCourse {
  public static void main(String args[]) {
    Course c1 = new Course();
    Course c2 = new Course();
    c1.enrollments = 100;
    c2.enrollments = 200;
    System.out.println(c1.enrollments + c2.enrollments);
  }
}

