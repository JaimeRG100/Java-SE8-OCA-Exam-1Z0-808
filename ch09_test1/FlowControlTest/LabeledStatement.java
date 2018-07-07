class LabeledStatement {
  
  public static void main(String... args) {
    
    String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
    outer:
    for (String name1 : programmers) { 
      for (String name2 : programmers) {
        if (name2.equals("Shreya"))
              break outer;
        System.out.println(name2);
      }
    }
    System.out.println("- - - -  -");
    
    outer:
    for (String name1 : programmers) { 
      for (String name2 : programmers) {
        if (name2.equals("Shreya"))
              continue outer;
        System.out.println(name2);
      }
    }
    System.out.println("- - - -  -");
      
  }
}