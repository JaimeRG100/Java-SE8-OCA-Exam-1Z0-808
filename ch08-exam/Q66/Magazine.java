class Book {
  private int pages = 100;
}

public class Magazine extends Book {
  private int interviews = 2;
  private int totalPages() { 
    /* INSERT CODE HERE */
    return  super.pages + this.interviews * 5;   // Error: pages has private access in Book
  }
  
  public static void main(String[] args) {
    System.out.println(new Magazine().totalPages());
  }
    
}