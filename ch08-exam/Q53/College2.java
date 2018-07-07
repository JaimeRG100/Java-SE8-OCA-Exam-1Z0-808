class Phone {
  String keyboard = "in-built";
}

class Tablet extends Phone {
  boolean playMovie = false;
}

public class College2 {
  public static void main(String args[]) {
    Phone phone = new Tablet();
    System.out.println(phone.keyboard + ":" + phone.playMovie);
    // System.out.println(phone.keyboard + ":" + ((Tablet)phone).playMovie);   // This code would compile successful
    
  }
}