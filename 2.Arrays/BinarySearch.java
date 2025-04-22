public class BinarySearch {
    public static int binary(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end)/2;

        while (start<=end){
            mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,22};
        int key = 8;
        System.out.println(binary(arr,key) );
    }
}
