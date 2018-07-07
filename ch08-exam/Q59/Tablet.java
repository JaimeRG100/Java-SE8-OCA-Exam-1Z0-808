interface Romoable {}
class Phone {}
public class Tablet extends Phone implements Romoable {
  // INSERT CODE HERE
  Romoable var = (Romoable) new Phone();
}