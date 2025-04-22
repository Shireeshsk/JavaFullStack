public class DiagonalSum {
    public static void sum_bruteforce(int arr[][]){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(i==j){
                    sum = sum + arr[i][j];
                }
                if(((i+j)==arr.length-1)&&(i!=j)){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("sum = "+sum);
    }

    public static void sum_optimised(int arr[][]){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i][i];
            if(i!=arr.length-i-1){
                sum += arr[i][arr.length-1-i];
            }
        }
        System.out.println("sum = "+sum);
    }

    public static void main(String args[]){
        int nums[][]={{1,2,3},{4,5,6},{7,8,9}};
        sum_bruteforce(nums);
        sum_optimised(nums);

    }
}
