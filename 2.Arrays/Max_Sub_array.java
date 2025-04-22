public class Max_Sub_array{
//Bruteforce
    public static int maxsubarray(int arr[]){
        int max = Integer.MIN_VALUE ;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 1;j<arr.length;j++){
                for(int k = i;k<=j;k++){
                    sum = sum + arr[k];
                    if(max<sum){
                        max = sum;
                    }
                }
                sum = 0; 
            }
        }
        return max;
    }
    public static void main(String args[]){
        int array[] = {1,-2,6,-1,3};
        System.out.println(maxsubarray(array));
    }
}