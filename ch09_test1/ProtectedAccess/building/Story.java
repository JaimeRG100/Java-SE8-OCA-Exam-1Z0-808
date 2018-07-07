package building;

public class Story extends StoryBook{
  
  public void letsTry() {    
    author = "AZ";
    modifyTemplate();
  }
  
  public static void main(String... args) {
    new Story().letsTry();
    
    Story s = new Story();
    s.author = "OK";
    s.modifyTemplate();
  }
  
  
}

