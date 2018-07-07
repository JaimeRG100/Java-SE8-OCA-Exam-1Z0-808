class WebAccessLogin {
  
  public static void main(String... args){
    try {
      Website.access();
      Website.logIn();
      Website.selectBlog();
      System.out.println("Everythings ok"); 
    }
    catch(WebSiteUnavailableException e) {
      System.out.println("WebSiteUnavailableException"); 
    }
    catch(LogInUnsuccesfulException e) {
      System.out.println("LogInUnsuccesfulException"); 
    }
    catch(DatabaseAccessException e) {
      System.out.println("DatabaseAccessException"); 
    }
  }
}

class Website {
  static void access() throws WebSiteUnavailableException { }
  static void logIn() throws LogInUnsuccesfulException { }
  static void selectBlog() throws DatabaseAccessException { throw new DatabaseAccessException(); }
}

class WebSiteUnavailableException extends Exception {}
class LogInUnsuccesfulException extends Exception {}
class DatabaseAccessException extends Exception {}