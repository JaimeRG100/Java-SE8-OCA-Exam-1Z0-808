class TeachingClass {
  
  public static void main(String... args) {
    try {      
    teachClass();
    }
    catch(BookNotFoundException e){
      System.out.println("BookNotFoundException");
    }
  }
  
  static void teachClass() throws BookNotFoundException {
    
    boolean bookFound = locateBook();
    
    if(!bookFound)
      throw new BookNotFoundException();
    else {
      readBook();
      explainContents();
    }    
  }
  
  static boolean locateBook() { return false; }
  static void readBook() { System.out.println("readBook()"); }
  static void explainContents() { System.out.println("explaintContents()"); }
  
  
}

class BookNotFoundException extends Exception {}