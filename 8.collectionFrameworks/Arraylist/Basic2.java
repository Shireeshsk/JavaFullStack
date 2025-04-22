import java.util.*;
public class Basic2 {
    public static void main(String args[]){
        List<Integer> sk = new ArrayList<>();
        sk.add(1233);
        sk.add(45);
        sk.add(678);
        sk.add(45);
        sk.add(45);
        System.out.println(sk);
        System.out.println("minimum element "+Collections.min(sk));
        System.out.println("maximum element "+Collections.max(sk));
        System.out.println("frequency of element "+Collections.frequency(sk,45));
        Collections.sort(sk);
        System.out.println(sk);

        Collections.sort(sk,Comparator.reverseOrder());
        System.out.println(sk);

    }
}
