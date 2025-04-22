public class Subset {
    static int n = 0;
    public static void findSubset(String str,String ans,int i){
        //base case 
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            n++;
            return;
        }
        //recursion
        //yes choice
        findSubset(str, ans+str.charAt(i), i+1);
        //no choice
        findSubset(str, ans, i+1);
    }
    public static void main(String args[]){
        findSubset("egg","", 0);
        System.out.println(n);
    }
}