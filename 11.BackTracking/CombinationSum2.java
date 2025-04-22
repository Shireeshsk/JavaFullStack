import java.util.*;
public class CombinationSum2 {
    public static List<List<Integer>> Combinations(int nums[],int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,new ArrayList<>(),ans,nums,target);
        return ans;
    }
    public static void helper(int idx,List<Integer> combi,List<List<Integer>> ans,int arr[],int target){
        if(target==0){
            ans.add(new ArrayList<>(combi));
            return;
        }
        for(int i = idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            combi.add(arr[i]);
            helper(i+1,combi,ans,arr,target-arr[i]);
            combi.remove(combi.size()-1);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(Combinations(arr,target));
    }
}
