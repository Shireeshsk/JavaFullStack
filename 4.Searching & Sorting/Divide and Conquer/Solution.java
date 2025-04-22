public class Solution {
    public static void main(String[] args) {
        int arr[] = {10,5,10};
        int max = -1,smax=-1;
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                smax=max;
                max = arr[i];
            }
            else if(arr[i]!=max){
                smax=Math.max(smax,arr[i]);
            }
        }
        System.out.println(smax);
        
    }
}
