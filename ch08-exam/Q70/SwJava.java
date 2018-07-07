class SwJava {
   public static void main(String[] args) {
     String[] shapes = {"Circle", "Square", "Triangle"};
     switch(shapes) {  // mus be: shapes[0]   - - - Error: incompatible types: java.lang.String[] cannot be converted to int
       case "Circle": System.out.println("Circle"); break;
       case "Square": System.out.println("Square"); break;
       case "Triangle": System.out.println("Triangle"); break;                                         
     }
  }
   
}