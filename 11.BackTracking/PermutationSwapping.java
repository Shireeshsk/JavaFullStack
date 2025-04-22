import java.util.*;
public class PermutationSwapping {
    public static List<List<Integer>> permutations(int arr[]){
        List<List<Integer>> ans = new ArrayList<>();
        return ans;
    }
    public static void helper(int idx,List<List<Integer>> ans,int arr[]){
        if(idx>=arr.length){
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<arr.length;i++){
                list.add(arr[i]);
            }
            ans.add(list);
            return;
        }
        for(int i = idx;i<arr.length;i++){
            swap(idx,i,arr);
            helper(idx+1,ans,arr);
            swap(idx,i,arr);
        }
    }
    public static void swap(int a ,int b,int nums[]){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
