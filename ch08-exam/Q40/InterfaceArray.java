interface Jump {}
class Animal implements Jump {};

public class InterfaceArray {
  public static void main(String ... args){
    
    Jump eJump1[] = {null, new Animal()};
    //Jump[] eJump2 = new Animal()[22];
    Jump[] eJump3 = new Jump[10];
    Jump[] eJump4 = new Animal[87];
    //Jump[] eJump5 = new Jump()[12];
    
    // test code
    Jump j1;
    Jump j2[] = new Jump[2];
    Jump j3[][] = {new Jump[2], new Jump[3]};    
  }
}