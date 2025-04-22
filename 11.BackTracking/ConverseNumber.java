import java.util.*;
public class ConverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isConverse(toBinaryString(n)));
        sc.close();
    }
    public static boolean isConverse(String s){
        char temp = s.charAt(0);
        for(int i = 1;i<s.length();i++){
            if(temp==s.charAt(i)){
                return false;
            }
            temp = s.charAt(i);
        }
        return true;
    }
    public static String toBinaryString(int n){
        return Integer.toBinaryString(n);
    }
}
