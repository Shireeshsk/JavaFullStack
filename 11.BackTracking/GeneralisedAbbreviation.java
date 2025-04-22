import java.util.*;
public class GeneralisedAbbreviation {
    public static List<String> combinations(String s){
        List<String> ans = new ArrayList<>();
        helper(0,s,new StringBuilder(),0,ans);
        return ans;
    }
    public static void helper(int idx,String s,StringBuilder comb,int num,List<String> ans){
        int len = comb.length();
        if(idx>=s.length()){
            if(num>0){
                comb=comb.append(num);
            }
            ans.add(comb.toString());
            comb.setLength(len);
            return;
        }
        if(num>0){
            comb.append(num);
        }
        comb.append(s.charAt(idx));
        helper(idx+1,s,comb,0,ans);
        comb.setLength(len);
        helper(idx+1,s,comb,num+1,ans);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(combinations(s));
        sc.close();
    }
}
