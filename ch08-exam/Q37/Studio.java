class Artist {
  Artist assistant;
}

public class Studio {
  public static void main(String... args) {
    Artist a1 = new Artist();
    Artist a2 = new Artist();
    a2.assistant = a1;
    // start of aditional test code ------------
    a2.assistant.assistant = a1;  // No StackOverflowError because it doesn't use new(), only allocate memory for one Object
    //a2.assistant.assistant.assistant = a1; // java.lang.NullPointerException
    // end of aditional test code --------------
    a2 = null;      // Line 1. The number of objects that are garbage collected on line 1 is unknown
  }
  // Line 2. At least two objects are eligible for garbage collection on line 2
}