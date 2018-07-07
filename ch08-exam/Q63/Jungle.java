class Animal { float age; }
class Lion extends Animal { int claws; }
public class Jungle {
  public static void main(String args[]) {
    Animal animal = new Lion();
    // INSERT CODE HERE
    if (animal instanceof Lion)
      System.out.println(1);
  }
}
