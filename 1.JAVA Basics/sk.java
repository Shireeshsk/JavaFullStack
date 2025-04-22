import java.util.*;
public class sk{
    public static void average(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter a number : ");
        int b = sc.nextInt();
        System.out.print("Enter a number : ");
        int c = sc.nextInt();
        System.out.println("Average = "+((a+b+c)/3));
        sc.close();
    }
    public static void main(String args[]){
        average();
    }
}