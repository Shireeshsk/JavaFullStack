import java.util.*;
public class Solution{
    public static boolean palindrome(char[] arr,int start , int end){
        if(arr[start]!=arr[end]){
            return false;
        }
        if(start<end){
            return true;
        }
        palindrome(arr,start+1,end-1);
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] sk = s.toCharArray();
        System.out.println(palindrome(sk, 0, sk.length-1));
        sc.close();
    }
}