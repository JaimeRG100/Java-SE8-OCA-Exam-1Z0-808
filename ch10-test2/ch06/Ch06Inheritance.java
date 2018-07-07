class Ch06Inheritance {
  
  
  public static void main(String[] args) {
    
    
    Animal a = new Animal("none");
    System.out.println(a.name);
    Tiger t = new Tiger();
    System.out.println(t.name);
    System.out.println(t.getSuperName());
    
  }
  
}


class Animal {
  String name;
  
  Animal(){
    name = "Animal-default";
  }
  
  Animal(String str) {
    name = str;
  }
}

class Tiger extends Animal {
  String name;
  
  Tiger(){
    name = "tiger-default";
  }
  
  String getSuperName(){
    return super.name;
  }
  
    
  
}