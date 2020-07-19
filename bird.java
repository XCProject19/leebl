package inherited;

import javabasic.Animal;

public class bird extends Animal {
    private boolean canFly;
    public void Fly()
    {
        if(this.canFly)
            System.out.println("Flying");
        else
            System.out.println("Attemping to fly");
    }
    public void move(){
        System.out.println("Bird is moving");
    }
    public String getInfo(){
        String info=super.getInfo();
        info+="it is a bird";

    }
}
