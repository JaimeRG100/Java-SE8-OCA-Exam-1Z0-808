class Emp {
  Emp mgr = new Emp();
}

public class Office {
  public static void main(String args[]) {
    Emp e = null;
    e = new Emp();
    e = null;
  }
}