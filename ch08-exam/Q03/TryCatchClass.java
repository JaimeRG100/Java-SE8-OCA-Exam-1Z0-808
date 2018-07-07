class TryCatchClass {
  public static void main(String[] args) {
    int a = 10; String name = null;
    try {
      a = name.length();
      a++;
    } catch (NullPointerException e) {
        ++a;
        return;
      } catch (RuntimeException e) {
        a--;
        return;        
      } finally {
        System.out.println(a);
      }  
  }
}

