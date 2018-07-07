class TestEJava {
  
  public static void main(String ... asas) {
    ProgrammerX a = new ProgrammerX();
    ProgrammerX b = new AuthorX();
    a.print();
    b.print();
  }
}

class ProgrammerX {
  void print() {System.out.println("Programmer X");}

}

class AuthorX extends ProgrammerX{
  void print() {System.out.println("Author X");}

}
