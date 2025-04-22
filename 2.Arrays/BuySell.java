public class BuySell {
    public static int profit(int[] arr){
        int max = 0;
        int buy = Integer.MAX_VALUE;
        for( int i = 0;i<arr.length;i++){
            if(buy<arr[i]){
                int profit = arr[i] - buy;
                max = Math.max(max,profit); 
            }
            else{
                buy = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        // int nums[] = {7,1,5,3,6,4};
        int nums[] = {2};
        System.out.println(profit(nums));
    }
}
