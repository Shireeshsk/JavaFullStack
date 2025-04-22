public class Occurance {
    public static int FirstOccurance(int arr[],int target,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return FirstOccurance(arr,target,i+1);
    }

    public static int LastOccurance(int arr[],int target,int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return LastOccurance(arr,target,i-1);
    }
    public static void main(String args[]){
        int nums[] = {1,2,5,3,4,5,6,7,8};
        System.out.println(FirstOccurance(nums,5, 0));
        System.out.println(LastOccurance(nums, 5, nums.length-1));
    }
}
