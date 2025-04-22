import java.util.*;
public class prime {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean isprime = true;
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                isprime = false;
            }
        }
        if(isprime == true){
            System.out.println(n+" is a prime number ");
        }
        else{
            System.out.println(n+" is a not prime number ");
        }
        // this lop can be optmised further to
        // reduce time complexity for large numbers
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                isprime = false;
                break;
            }
        }
        if(isprime == true){
            System.out.println(n+" is a prime number ");
        }
        else{
            System.out.println(n+" is a not prime number ");
        }
        sc.close(); 
    }  
}
