class EBowl {
   public static void main(String[] args) {
     String eFood = "Corn";
     System.out.println(eFood);
     mix(eFood);
     System.out.println(eFood);
  }
   
   static void mix(String foodIn) {
     foodIn.concat("A");
     foodIn.replace('C','B');
   }
}