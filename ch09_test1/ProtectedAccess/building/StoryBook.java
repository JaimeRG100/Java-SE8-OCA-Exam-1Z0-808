package building;

import library.Book;

public class StoryBook extends Book {
  
  public StoryBook() {
    author = "XYZ";
    modifyTemplate();
  }
  
  public static void main(String... args) {
    Book book = new Book();
    //book.author = "ZYX";     // protected access
    //book.modifyTemplate();   // protected access
  }
}
