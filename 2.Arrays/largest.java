public class largest{
    public static void large(int arr[]){
        int max = Integer.MIN_VALUE;//Integer.MIN_VALUE = negative infinite
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("largest = "+max);
    }
    public static int small(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int arrr[]={34,67,114,89,87,56,01};
        large(arrr);
        System.out.println("smallest = "+small(arrr));
    }
}