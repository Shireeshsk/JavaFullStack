import java.util.*;
public class FactorCombinations {
    public static List<List<Integer>> factors(int num){
        List<List<Integer>> ans = new ArrayList<>();
        helper(2,ans,new ArrayList<>(),num);
        return ans;
    }
    public static void helper(int idx,List<List<Integer>> ans,List<Integer> list,int num){
        if(num==1){
            if(list.size()>1){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i = idx;i<=num;i++){
            if(num%i==0){
                list.add(i);
                helper(i,ans,list,num/i);
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int n = 32;
        System.out.println(factors(n));
    }
}
