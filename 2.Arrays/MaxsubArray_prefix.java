public class MaxsubArray_prefix {
    public static int maxsubarray(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int prefix[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
            prefix[i] = sum ;
        }
        sum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                sum = i == 0?prefix[j]:prefix[j] - prefix[i-1];
                if(sum>max){
                    max = sum;
                }
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] ={1,-2,6,-1,3};
        System.out.println(maxsubarray(arr));
    }
}
