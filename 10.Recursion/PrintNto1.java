public class PrintNto1{
    public static void main(String args[]){
        print(99);
    }

    static void print(int n){
        if(n==0){
            System.out.println();
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
}