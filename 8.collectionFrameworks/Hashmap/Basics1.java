import java.util.*;
public class Basics1{
    public static void main(String args[]){
        Map<String,Integer> sk = new HashMap<>();
        sk.put("one",1);
        sk.put("two",2);
        sk.put("three",3);
        sk.put("four",4);

        if(!sk.containsKey("four")){
            sk.put("four",44);
        }

        sk.putIfAbsent("five", 5);

        System.out.println(sk);
        System.out.println();
        System.out.println();

        for(Map.Entry<String,Integer> i : sk.entrySet()){
            System.out.print(i.getKey());
            System.out.print(i.getValue());
            System.out.println();
        }

        sk.remove("one",1);

        System.out.println(sk.keySet());
        System.out.println(sk.values());

        System.out.println(sk.containsValue(4));
        System.out.println(sk.isEmpty());

    }
}