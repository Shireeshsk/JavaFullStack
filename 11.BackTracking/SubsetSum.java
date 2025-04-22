import java.util.*;
public class SubsetSum{
    public static List<List<Integer>> finalans = new ArrayList<>();
    public static boolean helper(int idx,int arr[],int sum,List<Integer> ans,int k){
        if(idx==arr.length){
            if(sum==k){
                finalans.add(new ArrayList<>(ans));
                return true;
            }
            return false;
        }
        ans.add(arr[idx]);
        if(helper(idx+1,arr,sum+arr[idx],ans,k)==true){
            return true;
        }
        ans.remove(ans.size()-1);
        if(helper(idx+1,arr,sum,ans,k)==true){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int k = 2;
        helper(0,arr,0,new ArrayList<Integer>(), k);
        System.out.println(finalans);
    }

}