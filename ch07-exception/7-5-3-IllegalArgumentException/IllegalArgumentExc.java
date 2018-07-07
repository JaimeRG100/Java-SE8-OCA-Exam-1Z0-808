class IllegalArgumentExc {
  public static void main(String... arg) {
    
    try {
      new IllegalArgumentExc().login("User","123456", 1);
    }
    catch(IllegalArgumentException e) {
      System.out.println(e);
    }
    
    try {
      new IllegalArgumentExc().login("User123","123456", 2);
    }
    catch(IllegalArgumentException e) {
      System.out.println(e);
    }
    
    try {
      new IllegalArgumentExc().login("User123","12345678", -3);
    }
    catch(IllegalArgumentException e) {
      System.out.println(e);
    }
    
  }
  
  public void login(String username, String pwd, int maxLoginAttempt) {
    if (username == null || username.length() < 6 )
      throw new IllegalArgumentException ("Login: username can't be shorter than 6 chars");
    if (pwd==null || pwd.length() < 8) 
      throw new IllegalArgumentException ("Login: pwd cannot be shorter than 8 chars");
    if (maxLoginAttempt < 0) 
      throw new IllegalArgumentException ("Login: Invalid loginAttempt val");
  }
}
