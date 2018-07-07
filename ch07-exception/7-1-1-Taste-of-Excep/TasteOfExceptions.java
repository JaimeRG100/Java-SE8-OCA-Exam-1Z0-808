import java.io.*;

class TasteOfExceptions {
  
  public static void main(String... args){
    
    try {
      ArrayAccess.main(args);
    }
    catch (ArrayIndexOutOfBoundsException e) {
     System.out.println("ArrayIndexOutOfBoundsException");
    }
    
    
    try {
      OpenFile.main(args);
    }
    catch(FileNotFoundException e) {
      System.out.println("FileNotFoundException");
    }
    
    try {
      MethodAccess.myMethod(1);
    }
    catch(StackOverflowError e) {
      System.out.println("StackOverflowError Simulated");
    }
    
  }
  
}

class ArrayAccess {
  public static void main(String args[]){
    String[] students = {"Shreya", "Joseph", null};
    System.out.println(students[5].length());         // java.lang.ArrayIndexOutOfBoundsException
  }
}

class OpenFile {
  public static void main(String args[]) throws FileNotFoundException {
    FileInputStream fis = new FileInputStream("file.txt");
  }
}

class MethodAccess {
  public static void myMethod(int i){
    System.out.println("myMethod: " + i);
    if (i>100) {
      throw new StackOverflowError();
    }
    myMethod(++i);
  }
}