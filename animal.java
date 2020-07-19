package fairway.javabasic.encapsulation;

public class animal {
    private int size;
    private int lifespan;
    public String lastAction;


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
    public animal(){
        this.lifespan=100;
        this.lastAction="Default Constructor";
    }

    public animal(int lifespan) {
        this.lastAction="Object created by one Argumented constructor";
        this.lifespan = lifespan;
        this.size=1;
    }

    public animal(int size, int lifespan) {
        this.lastAction="Object created by two Argumented constructor";
        this.size = size;
        this.lifespan = lifespan;
    }
    public void move(){
        System.out.println("Moving");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public String getInfo(){
        return"this animal has average lifespan:"+this.lifespan+",size:"+this.size;
    }
}
