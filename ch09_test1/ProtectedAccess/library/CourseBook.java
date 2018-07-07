package library;

public class CourseBook extends Book {
  
  public CourseBook() {
    author = "ABC";
    modifyTemplate();
  }
  
  public static void main(String... args) {
    System.out.println(new CourseBook().author);
  }
}