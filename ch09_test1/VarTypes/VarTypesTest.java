class VarTypesTest {
  
  public static void main(String... args) {
    final int fin = 50;
    final long finLN = 256;
    byte by1 = 10 + 1;
    short sh1 = 120 + 2;
    int in1 = 130 + 3 ;
    long lo1 = 140 + 4;
    float fl1 = 123.45f;
    double do1 = 456.789;
    
    // No cast needed with final int
    by1 = fin;
    by1 = fin + 70;
    sh1 = fin + 2500;
    in1 = fin + 258484;
    
    in1 = (int) 125/1;
    
    // if final long, cast needed
    by1 = (byte) finLN + 1;
    in1 = (int) finLN + 258484;
    // System.out.println(by1);  // Output 1
    
    
    // Artihmetic operators with VARIABLES return int. If long involved, return long. If float involved, return double
    by1 = (byte) (by1 + by1);
    in1 =  by1 + sh1 + in1;
    in1 =  (int)(by1 + sh1 + in1 + lo1);
    fl1 = in1 / 5.3f;
    fl1 = (float)(in1 / 5.3);
    do1 = in1 / 5.3;
    
    // obscure techniques to assign unsigned integer to a char
    char cc = (char) -65500 ;
    System.out.println(cc);
    System.out.println((int)cc);
    
    // underscore
    float floatLiteral =  100.4827F;
    floatLiteral =  100.482_7F;
    floatLiteral =  100.4_827F;
    floatLiteral =  1_0_0.4_8_2_7F;
    
    // char and operators
    char char1 = 'a';
    System.out.println(++char1);
    System.out.println(char1 + 1);
    System.out.println((char)(char1 + 1));
    
  }  
}