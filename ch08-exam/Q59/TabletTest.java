interface Romoable {}
class Phone {}
class Tablet extends Phone implements Romoable {
  // INSERT CODE HERE
  Romoable var = (Romoable) new Phone();
}

public class TabletTest   {
  // INSERT CODE HERE
  public static void main(String[] args) {
    new Tablet();
  }
}