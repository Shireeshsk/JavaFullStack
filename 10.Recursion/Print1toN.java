public class Print1toN {
    public static void print(int N){
        if(N==0){
            return;
        }
        print(N-1);
        System.out.print(N+" ");
    }
    public static void main(String args[]){
        print(10);
    }
}
