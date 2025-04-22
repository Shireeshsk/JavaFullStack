public class decimal_to_binary {
    public static void deci_to_bin(int a){
        int bin = 0,j=0;
        while(a>0){
            int lastdigit = a % 2;
            bin = bin +(lastdigit*(int)Math.pow(10,j));
            j++;
            a /= 2;
        }
        System.out.println(bin);
    }
    public static void main(String args[]){
        int num = 5;
        deci_to_bin(num);
    }
}