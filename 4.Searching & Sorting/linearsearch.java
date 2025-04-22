public class linearsearch {
    public static int linear(int arr[],int key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        // int num[] = {2,4,6,8,10,12,14,16};
        // int key = 10;
        // if(linear(num,key) !=-1){
        //     System.out.println(key+" found at index "+ linear(num,key));
        // }
        // else{
        //     System.out.println("NOT FOUND");
        // }
        System.out.println("MAX = "+Integer.MAX_VALUE);
        System.out.println("MIN = "+Integer.MIN_VALUE);
    }
}