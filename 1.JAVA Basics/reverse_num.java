import java.util.*;
public class reverse_num {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int k = sc.nextInt();
        int n = k;
        int f = k;
        System.out.print("Printing Reverse of the number : ");
        while(n>0){
            int last = n%10;
            n /= 10;
            System.out.print(last);
        }
        System.out.print("\n");
        System.out.print("reversing the original number : ");
        sc.close();
        int rev = 0;
        int last;
        while(f>0){
            last = f%10;
            rev = (rev*10) + last;
            f /=10;
        }
        System.out.print(rev);
    }   
}