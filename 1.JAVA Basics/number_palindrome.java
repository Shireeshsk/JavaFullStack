import java.util.*;
public class number_palindrome{
    public static boolean ispalindrome(int num){
        int temp = num,rev = 0;
        while(temp >0){
            int last = temp % 10;
            rev = rev * 10 + last;
            temp /= 10;
        }
        // if(num == rev){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        boolean sk;
        return  sk = num==rev?true:false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        if(ispalindrome(x)==true){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println(" NOT A PALINDROME");
        }
        sc.close();
    }
}