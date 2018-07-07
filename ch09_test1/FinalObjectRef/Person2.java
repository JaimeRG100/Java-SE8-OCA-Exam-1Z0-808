public class Person2 {
  final void sign() {
    System.out.println("Sing");
  }  
  public static void main(String... args) {
    Person2 p2 = new Person2();
    //System.out.println(p.name);
  }
}
class Professor extends Person2 {
  
  // Error: sign() in Professor cannot override sign() in Person2
  // overridden method is final
  /*
  void sign(){
    System.out.println("Professor sign");
  }
  */
}