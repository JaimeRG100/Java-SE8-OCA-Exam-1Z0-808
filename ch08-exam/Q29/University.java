class EJavaCourse {
  String courseName = "Java";
}

public class University {
  public static void main(String args[]) {
    EJavaCourse courses[] = {new EJavaCourse(), new EJavaCourse()};
    courses[0].courseName = "OCA";
    for (EJavaCourse c: courses) c= new EJavaCourse();
    for (EJavaCourse c: courses) System.out.println(c.courseName);
  }
}