import java.util.*;
public class Practice {
    public static List<List<Integer>> subsequence(int arr[]){
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,new ArrayList<>(),ans,arr);
        return ans;
    }
    public static void helper(int idx,List<Integer> list,List<List<Integer>> ans,int arr[]){
        if(idx>=arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[idx]);
        helper(idx+1,list,ans,arr);
        list.remove(list.size()-1);
        helper(idx+1,list,ans,arr);
    }
    public static List<List<Integer>> subsequenceSumk(int arr[],int k){
        List<List<Integer>> ans = new ArrayList<>();
        helper2(0,new ArrayList<>(),ans,k,arr);
        return ans;
    }
    public static void helper2(int idx,List<Integer> list,List<List<Integer>> ans,int target,int arr[]){
        if(target<0){
            return;
        }
        if(idx>=arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(arr[idx]);
        helper2(idx+1,list,ans,target-arr[idx],arr);
        list.remove(list.size()-1);
        helper2(idx+1,list,ans,target,arr);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int k = 2;
        System.out.println(subsequenceSumk(arr,k));
    }
}
