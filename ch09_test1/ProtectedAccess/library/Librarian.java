package library;

public class Librarian{
  
  public Librarian() {
    Book book = new Book();
    book.author = "CBA";
    System.out.println(book.author);
    book.modifyTemplate();
  }
  
  public static void main(String... args) {
    new Librarian();
  }
}