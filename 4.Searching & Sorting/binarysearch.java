public class binarysearch {
    public static void sort(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static int binary(int arr[],int key){
        int start = 0;
        int end = arr.length -1;
        int mid = (start+end)/2;
        int index = -1;
        while(end>=start){
            if(arr[mid]==key){
                index = mid;
                break;
            }
            else if(arr[mid]<key){
                start = mid + 1;
                mid = (start+end)/2;
            }
            else{
                end = mid-1;
                mid = (start+end)/2;
            }
        }
        return index;
    }
    public static void main(String args[]){
        int arr[] = {34,67,12,90,1,35,0,-1};
        int key = 90;
        sort(arr);
        // arr = {-1,0,1,12,34,35,67,90}
        if(binary(arr,key) !=-1){
            System.out.println(key+" found at index "+ binary(arr,key));
        }
        else{
            System.out.println("NOT FOUND");
        }
    }
}
