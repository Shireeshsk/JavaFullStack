import java.util.*;
public class CombinationSum1 {
    static List<List<Integer>> ans = new ArrayList<>();
    public static void combiSum(int arr[],int idx,List<Integer> list,int target){
        if(idx>=arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(target-arr[idx]>=0){
            list.add(arr[idx]);
            combiSum(arr,idx,list,target-arr[idx]);
            list.remove(list.size()-1);
        }
        combiSum(arr,idx+1,list,target);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;
        combiSum(arr,0,new ArrayList<>(),target);
        System.out.println(ans);
    }
}
