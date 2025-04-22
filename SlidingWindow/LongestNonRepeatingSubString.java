import java.util.*;
public class LongestNonRepeatingSubString {
    public static int helper(String str){
        int maxlen = 0,count = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                count = 0;
                map.remove(str.charAt(i));
                continue;
            }
            count++;
            map.put(str.charAt(i),1);
            maxlen=Math.max(maxlen,count);
        }
        return maxlen;
    }

    public static int correct(String s){
        int l = 0,maxlen = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int r =0;r<s.length();r++){
            char sk = s.charAt(r);
            if(map.containsKey(sk)){
                l = Math.max(map.get(sk)+1,r);
            }
            map.put(sk,r);
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(helper(str));
        sc.close();
    }
}
