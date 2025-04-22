import java.util.*;

public class FruitBasket {
    public static int Mysol(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> sk:map.entrySet()){
            list.add(new int[]{sk.getKey(),sk.getValue()});
        }
        Collections.sort(list,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                return b[1]-a[1];
            }
        });
        int maxfruits =0;
        for(int i = 0;i<Math.min(2,list.size());i++){
            maxfruits += list.get(i)[1];
        }
        return maxfruits;
    }

    public static int correct(int arr[]){
        int l = 0,max =0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int r = 0;r<arr.length;r++){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            if(map.size()>2){
                if(map.get(arr[l])==1){
                    map.remove(arr[l]);
                    l++;
                    continue;
                }
                map.put(arr[l],map.get(arr[l])-1);
                l++;
            }
            max = Math.max(max,r-l+1);
        } 
        return max;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,2,2};
        System.out.println(correct(arr));
    }
}
