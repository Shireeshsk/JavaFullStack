public class FriendsPairing {
    public static int friends(int n){
        if(n==1 || n==2){
            return n;
        }
        //single 
        int fnm1 = friends(n-1);
        //pairing
        int fnm2 = friends(n-2);
        int pairways = (n-1)*fnm2;
        int total = fnm1 + pairways;
        return total ;
    }
    public static void main(String args[]){
        System.out.println(friends(3 ));
    }
}
