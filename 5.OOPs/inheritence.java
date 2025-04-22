public class inheritence {
    public static void main(String args[]){
        fish tuna = new fish();
        tuna.eat();
        tuna.swims();

        dog dobby = new dog();
        dobby.eat();
        dobby.legs=4;
        dobby.breed = "shitzu";
        System.out.println(dobby.legs);
        System.out.println(dobby.breed);
    }
}
class animals{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class fish extends animals{
    int fins;

    void swims(){
        System.out.println("void swims in water");
    }
}

class mammals extends animals{
    int legs;
}

class dog extends mammals{
    String breed;
}