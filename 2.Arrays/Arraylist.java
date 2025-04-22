import java.util.*;
public class Arraylist{
    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(-1);

        list.add(3,6);

        System.out.println(list);

        System.out.println(list.get(3));

        list.remove(2);
        System.out.println(list);

        list.set(2,10);
        System.out.println(list);

        System.out.println(list.contains(10));

        System.out.println(list.size());


        System.out.print("elements are :");
        for(int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.add(11);
        list.add(21);
        list.add(-3);
        list.add(-6);
        System.out.println(list);
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        System.out.println("Max = "+max);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}