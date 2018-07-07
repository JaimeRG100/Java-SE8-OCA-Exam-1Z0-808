public class TestCode implements Animal{
  
  public static void main(String ... args) {
    TestCode tc = new TestCode();
    tc.Animal();
    System.out.println(Jumpable.MIN_DISTANCE);
    System.out.println(Moveable.MIN_DISTANCE);    
  }
}


interface Jumpable {
  int MIN_DISTANCE = 10;
}

interface Moveable {
  String MIN_DISTANCE = "SMALL";
}

interface Animal extends Jumpable, Moveable {
  default void Animal() {
    System.out.println(Jumpable.MIN_DISTANCE);
  }
  
}

