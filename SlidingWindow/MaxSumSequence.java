// constant window type problem 
public class MaxSumSequence{
    public static void main(String args[]){
        int arr[] = {-1,2,3,3,4,5,-1};
        int n = 4;
        System.out.println(maxSum(arr,n));
        System.out.println(maxArrSum(arr, n));
    }


    //tc O(arr.length*num)
    public static int maxSum(int arr[],int num){
        int l = 0;
        int r = num-1;
        int max = Integer.MIN_VALUE;
        while(r<arr.length){
            int currsum = 0;
            for(int i = l;i<=r;i++){
                currsum += arr[i];
            }
            max = Math.max(max,currsum);
            l++;
            r++;
        }
        return max;
    }

    //tc O(n)
    public static int maxArrSum(int arr[],int num){
        int l = 0;
        int r = num-1;
        int max = 0;
        for(int i =0;i<=r;i++){
            max += arr[i];
        }
        int csum = max;
        while(r<arr.length-1){
            csum = csum - arr[l];
            l++;
            r++;
            csum = csum + arr[r];
            max = Math.max(csum,max);
        }
        return max;
    }
}