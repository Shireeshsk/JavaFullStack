import java.util.*;
public class PalindromeString {
    public static boolean palindrome(String str){
        int n = str.length();
        for(int i = 0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string : ");
        String str = sc.nextLine();
        if(palindrome(str)==true){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
        sc.close();

    }
}