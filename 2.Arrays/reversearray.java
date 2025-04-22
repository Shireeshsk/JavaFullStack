public class reversearray {
    // public static void reverse(int arr[]){
    //     for(int i = 0,j=arr.length-1;i<arr.length/2;i++,j--){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //     }
    // }
    public static void reversewhile(int arr[]){
        int first = 0, last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int arr[] = {11,22,33,44};
        reversewhile(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }   
}
