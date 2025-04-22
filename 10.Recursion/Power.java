public class Power {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

    public static int optmisedpower(int x ,int n){
        if(n==0){
            return 1;
        }
        int halfpower = optmisedpower(x, n/2) * optmisedpower(x, n/2);
        if(n%2==1){
            halfpower = x*halfpower;
        }
        return halfpower;
    }
    
    public static void main(String args[]){
        System.out.println(power(3,3));
        System.out.println(optmisedpower(3, 3));
    }
}
