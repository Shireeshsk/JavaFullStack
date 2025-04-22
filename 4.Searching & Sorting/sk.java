public class sk{
    public static int BinarySearch(int arr[], int target,int left , int right ){
        if(left>right){
            return left;
        }
        int mid = (left+right)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return BinarySearch(arr, target, left, mid-1);
        }
        return BinarySearch(arr, target, mid+1, right);
    }
    public static void main(String[] args){
        int nums[] = {1,3,5,7,9};
        System.out.println(BinarySearch(nums, 2, 0, nums.length-1));
    }
}
