interface Keys { 
  String keypad(String regio, int keys);
}

public class Handset {
  public static void main(String... args) {
    double price;
    String model;
    Keys varKeys = (region, keys) -> {if (keys >=32) return region; else return "default";};
    System.out.println(model + price + varKeys.keypad("AB",32));      // Error: variable model might not have been initialized
    
    // test code
    // System.out.println(varKeys.keypad("AB",32));   // output AB
  }
}