public class GridWays {
    public static int BruteForce(int i, int j, int n ,int m){
        if(i==n-1 && j==n-1){
            return 1;
        }
        else if(i==n ||j==m){
            return 0;
        }
        int w1= BruteForce(i+1, j, n, m);
        int w2= BruteForce(i, j+1, n, m);
        return w1+w2;
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int Optimal(int n,int m){
        return fact(n-1+m-1)/(fact(n-1)*fact(m-1));
    }

    public static void main(String args[]){
        System.out.println(BruteForce(0, 0, 3, 3));
        System.out.println(Optimal(10, 10));
    }
}
