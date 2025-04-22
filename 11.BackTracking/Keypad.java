import java.util.*;
public class Keypad {
    static String map[] ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void combinations(int idx,String digits,String comb,List<String> ans){
        if(idx>=digits.length()){
            ans.add(comb);
            return;
        }
        String s = map[digits.charAt(idx)-'0'];
        for(int i = 0;i<s.length();i++){
            combinations(idx+1, digits, comb+s.charAt(i), ans);
        }
    }
    public static List<String> Answer(String digit){
        List<String> ans = new ArrayList<>();
        combinations(0, digit, "", ans);
        return ans;
    }

}
