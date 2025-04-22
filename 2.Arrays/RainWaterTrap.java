public class RainWaterTrap {
    public static int trappedwater(int arr[]){
        int units = 0,sum = 0;
        int max = Integer.MIN_VALUE;
        int leftmax[] = new int[arr.length];
        leftmax[0] = 0;
        int rightmax[] = new int[arr.length];
        rightmax[arr.length-1] = 0;
        for(int i = 1;i<arr.length;i++){
            if(max<arr[i-1]){
                max = arr[i-1];
            }
            leftmax[i] = max;
        }
        max = 0;
        for(int i = arr.length -2;i>=0;i--){
            if(max<arr[i+1]){
                max = arr[i+1];
            }
            rightmax[i]=max;
        }
        for(int i = 0;i<arr.length;i++){
            int min = Math.min(leftmax[i],rightmax[i]);
            sum = min - arr[i];
            if(sum<0){
                sum = 0;
            }
            units = units + sum;            
        }
        return units;
    }
    public static void main(String[] args) {
        int nums[] = {4,2,0,6,3,2,5};
        System.out.println(trappedwater(nums));
    }
}
