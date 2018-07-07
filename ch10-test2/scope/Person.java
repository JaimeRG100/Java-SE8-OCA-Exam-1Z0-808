public class Person {
 public int height;
 
 public void setHeight(int newHeight) {
   if (newHeight <= 300)
     height = newHeight;
 }
 
 
 public double numbers(long arg1, byte arg2, double arg3) { 
   return arg1+arg2+arg3;
 }
 
 public static void main(String[] args) {
   Person p = new Person();
   p.setHeight(339);
   System.out.println(p.height);
   p.height= 339;
   System.out.println(p.height);
   
   
   System.out.println(p.numbers(1,(byte)1,1));
 }
 
}