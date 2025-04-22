import java.util.*;
public class Problem {
    public static List<String> Answer(String s){
        List<String> ans = new ArrayList<>();
        helper(0,s,"",ans);
        return ans;
    }
    public static void helper(int idx,String s,String ans,List<String> list){
        if(idx>=s.length()){
            list.add(ans);
            return;
        }
        if(s.charAt(idx)=='['){
            while(s.charAt(idx)!=']'){
                idx++;
                int comma = s.indexOf(',',idx);
                int brac = s.indexOf(']',idx);
                comma = (comma==-1 || comma>brac)?brac:comma;
                helper(brac+1,s,ans+s.substring(idx,comma),list);
                idx = comma;
            }
        }
        else{
            int next = s.indexOf('[',idx);
            next=next==-1?s.length():next;
            helper(next+1,s,s.substring(idx, next),list);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sk = sc.nextLine();
        System.out.println(Answer(sk));
        sc.close();
    }
}
