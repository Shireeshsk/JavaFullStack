public class RotatedSortedSearch {
    public static int Search(int arr[],int target,int left,int right){
        if(left>right){
            return -1;
        }
        int mid = left + (right-left)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[left]<=arr[mid]){
            if(arr[left]<=target && target<=arr[mid]){
                return Search(arr,target,left,mid-1);
            }
            else{
                return Search(arr,target,mid+1,right);
            }
        }
        else{
            if(arr[mid]<=target && target<=arr[right]){
                return Search(arr,target,mid+1,right);
            }
            else{
                return Search(arr,target,left,mid-1);
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {4,5,6,7,0,1,2};
        int target=0;
        System.out.println(Search(nums,target,0,nums.length-1));
    }
}
