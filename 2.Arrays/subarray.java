public class subarray {
    public static void subarr(int arr[]){
        int ts = 0;
        for(int i = 0;i<arr.length;i++){
            int start = arr[i];
            for(int j = i;i<arr.length;i++){
                int end = j;
                for(int k = start ;k<= end;k++){
                    System.out.println(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("subarrays = "+ts);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        subarr(arr);
    } 
}
