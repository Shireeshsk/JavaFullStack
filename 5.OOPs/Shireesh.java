// private class access 
// import java.util.*;

public class Shireesh {

    protected class kumar{
        private String name = "shireesh";
        String getname(){
            return name;
        }
    }
    public static void main(String args[]){
        Shireesh sk = new Shireesh();
        kumar psk = sk.new kumar();

        System.out.println(psk.getname());   
    }
}