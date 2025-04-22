public class abstractclass {
    public static void main(String args[]){
        horse h = new horse();
        h.eat();
        h.walk();
        h.changecolor();
        System.out.println(h.color);
        chicken c = new chicken();
        c.eat();
        c.walk();
        mustang m = new mustang();     
    }
}


abstract class animal {
    String color;
    animal(){
        this.color = "brown";
        System.out.println("animal constructor is called...");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class horse extends animal{
    horse(){
        System.out.println("horse constructr is called...");
    }
    void changecolor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("mustang constructor is called...");
    }
}

class chicken extends animal{
    void changecolor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}