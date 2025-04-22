public class KadansAlgorithm {
    public static int maxsubarray(int arr[]){
        int max = Integer.MIN_VALUE;
        int csum = 0;
        for(int i = 0;i<arr.length;i++){
            csum = csum+arr[i];
            if(csum>max){
                max = csum;
            }
            if(csum<0){
                csum = 0;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        System.out.println(maxsubarray(arr));
    }
}
