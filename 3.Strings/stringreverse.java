import java.util.*;
public class stringreverse {
    public static void reverse(char[] s,int left,int right){
        if(left>right){
            System.out.println(new String(s));
            return;
        }
        char temp = s[left];
        s[left++] = s[right];
        s[right--] = temp;
        reverse(s,left,right);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sk = sc.nextLine();
        char arr[] = sk.toCharArray();
        reverse(arr,0,arr.length-1);
        sc.close();
    }
}
