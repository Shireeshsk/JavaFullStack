import java.util.*;
public class CubeWords {
    public static int combinations(String s){
        int c = 0;
        return c;
    }
    public static void helper(int idx,String s,String combi,List<String> ans){
        if(idx>=s.length()){
            ans.add(combi);
            return;
        }
        helper(idx+1,s,combi+s.charAt(idx),ans);
        helper(idx+1,s,combi,ans);
    }

    public static void main(String[] args) {
        String s = "EGG";
        List<String> ans = new ArrayList<>();
        helper(0,s,"",ans);
        System.out.println(ans);
    }
}
