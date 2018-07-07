class TestData {
  
  public static void main(String[] args) {
    byte by = 127;
    short sh = 32_767;
    int in = 2_147_483_647;
    long lo = 9_223_372_036_854_775_807L;
    char ch = 'a';
    float fl = 12.123_456789f;
    double db = 12_345_678.123_456_789D;
    
    System.out.print("byte: " + by + " ");
    System.out.print("short: " + sh + " ");
    System.out.print("int: " + in + " ");
    System.out.print("long: " + lo + " ");
    System.out.println(); // -------------------
    
    by = 1; sh = 42; in = 84; lo = 127;
    by = (byte)sh;
    sh = (short)in;
    in = (int) lo;
    lo = 1_000_000L;
    System.out.print("byte: " + by + " ");
    System.out.print("short: " + sh + " ");
    System.out.print("int: " + in + " ");
    System.out.print("long: " + lo + " ");
    System.out.println(); // -------------------
        
    System.out.print("float: " + fl + " ");
    System.out.print("double: " + db + " ");
    db = 1.201762e2;
    System.out.print("double: " + db + " ");
    System.out.println(); // -------------------
    
    for(int i = 0; i < 26; i++) {
      System.out.print(ch + " ");
      ch++;
    }
    System.out.println(); // -------------------
    
    int octVal = 0_413;
    int hexVal = 0x10_b;
    int binVal = 0b100001011;
    System.out.print("oct: " + octVal + " ");
    System.out.print("hex: " + hexVal + " ");
    System.out.print("bin: " + binVal + " ");
    System.out.println(); // -------------------
    
    System.out.print("oct+bin: " + octVal + binVal + " ");
    System.out.print("hex+oct: " + hexVal + octVal + " ");
    System.out.print("oct+hex: " + octVal + hexVal + " ");
    System.out.println(); // -------------------
    
    System.out.print("parseByte: " + Byte.parseByte("123") + " ");
    System.out.print("parseShort: " + Short.parseShort("1234") + " ");
    System.out.print("parseInt: " + Integer.parseInt("12345") + " ");
    System.out.print("parseLong: " + Long.parseLong("123456789") + " ");
    System.out.print("parseFloat: " + Float.parseFloat("123.456") + " ");
    System.out.print("parseDouble: " + Double.parseDouble("123456.123456789") + " ");
    //System.out.print("parseChar: " + Char.parseChar('c') + " ");      // parseBoolean
    System.out.print("parseBoolean: " + Boolean.parseBoolean("TruE") + " ");
    System.out.println(); // -------------------    
    
    char c1 = 122;
    char c2 = '\u0122';
    System.out.print("c1: " + c1 + " ");
    System.out.print("c2: " + c2 + " ");
    System.out.println(); // -------------------    
    
    
    by = (byte) sh;
    sh = (short) in;
    in = (int)lo;
    lo = (long)ch;
    ch = (char)fl;
    fl = (float)db;
    db = (double)db;
    System.out.print("byteShort: " + by + " ");
    System.out.print("shortInt: " + sh + " ");
    System.out.print("intLong: " + in + " ");
    System.out.print("longChar: " + lo + " ");
    System.out.print("charFloat: " + ch + " ");
    System.out.print("floatDouble: " + fl + " ");
    System.out.print("doubleDouble: " + db + " ");
    System.out.println(); // -------------------   
    
    boolean bData;
    //bData = (boolean) 52;
    //bData = (boolean) 'a';
    //bData = (boolean) "hi";
    bData = (boolean) true;
    
    
    
  }
  
}