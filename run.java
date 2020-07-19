package fairway.javabasic.encapsulation;

import javabasic.Animal;

public class run {
    public  static  void main(String[] args){
        System.out.println("----Getter setter");
        Animal animal1=new Animal();
        animal1.setLifespan(50);
        animal1.setSize(1);
        String output=animal1.getInfo();
        show(output);

        System.out.println( "one argumented constructor");
        Animal animal2=new Animal();
        animal1.setSize(2);
        System.out.println(animal2.lastAction);

    }
}
