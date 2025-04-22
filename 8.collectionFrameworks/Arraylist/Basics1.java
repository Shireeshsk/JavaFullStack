import java.util.*;
public class Basics1{
    public static void main(String args[]){
        List<String> sk = new ArrayList<>();
        sk.add("shireesh");
        sk.add("rakesh");
        sk.add("uday");
        sk.add("parjan");
        sk.add(4,"omkar");
        sk.add(2,"runith");
        System.out.println(sk);

        sk.set(1,"rakesh polagoni");

        ArrayList<String> sk2 = new ArrayList<>();
        sk2.add("sankeerth");
        sk2.add("siddharth");
        
        sk.addAll(6, sk2);
        System.out.println(sk);

        System.out.println(sk.get(3));
        sk.remove(3);
        System.out.println(sk);

        sk.remove(String.valueOf("shireesh"));
        System.out.println(sk);

        System.out.println(sk.contains("sankeerth"));

        System.out.println(sk.size());

        for(String element : sk){
            System.out.println(element);
        }

        System.out.println("using iterator");

        Iterator<String> it = sk.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        sk.clear();
        System.out.println(sk);

    }
}