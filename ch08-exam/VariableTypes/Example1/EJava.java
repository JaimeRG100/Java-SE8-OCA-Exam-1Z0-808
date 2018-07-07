public class EJava {
  static int MIN_DISTANCE = 5;
  int age;
  float height;
  boolean result;
  String name;
  
  public static void main(String arguments[]) {
    EJava person = new EJava();
    System.out.println(person.name + "\n" +
                       person.height + "\n" +
                       person.result + "\n" +
                       person.age);
    
    long long1 = 5;
    Long long2 = 5L;
    // Long long3 = 5;    // Error: incompatible types: int cannot be converted to java.lang.Long
  }
}