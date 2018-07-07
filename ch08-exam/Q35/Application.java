public class Application {
  public static void main(String... args) {
    double price = 10;
    String model;
    if (price > 10)
      model = "Smartphone";
    else if (price <= 10)  // Error: variable model might not have been initialized
      model = "landline";
    System.out.println(model);
  }
}