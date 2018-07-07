class Foo {
  public static void main(String... args) {
    Interviewer m = new Manager();
    m.submitInterviewStatus();
    m.print();
  }
}

interface Interviewer {
  int MIN_SAL = 9999;
  default void submitInterviewStatus() {
    System.out.println("submitInterviewStatus");
  }
  String print();
}

class Manager implements Interviewer {
  public String print() {
    return "print: " + this;
  }
  
  public void submitInterviewStatus() {
    System.out.println("Overriden submit Method");
  }
  
  
}