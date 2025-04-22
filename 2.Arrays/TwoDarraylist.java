import java.util.*;
public class TwoDarraylist {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);list2.add(5);list2.add(6);
        mainlist.add(list);
        mainlist.add(list2);
        System.out.println(mainlist);
    }
}
