public class multipleinheritance {
    public static void main(String args[]){
        bear b = new bear();
        b.eat();
    }
    
}
interface herbivore{
    void eat();
}

interface carnivore{
    void eat();
}

class bear implements herbivore,carnivore{
    public void eat(){
        System.out.println("eat both plants and animals");
    }
}
System.gc();