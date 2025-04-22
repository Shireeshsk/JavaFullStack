// import java.util.*;
public class binary_to_decimal{
    public static void bintodeci(int a){
        int deci = 0,j = 0;
        while(a>0){
            int lastdigit = a % 10;
            deci += lastdigit*(int)Math.pow(2,j);
            j++;
            a /= 10;
        }
        System.out.println(deci);
    }
    public static void main(String args[]){
        int binary = 0b010;
        bintodeci(binary);
        int two = 2;
        int deci = 0,j = 0;
        int n = binary;
        while(n>0){
            n = n % 10;
            deci = deci +(n*(int)Math.pow(two,j));
            j++;
            n = n/10;
        }
        System.out.println(deci);
    }
}
