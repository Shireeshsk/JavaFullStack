public class SpiralMatrix {
    public static void Spiral(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        int left = 0,right = col-1,top=0,bottom=row-1;
        while(top<=bottom && left<=right){
            for(int i =left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i = top;i<=bottom;i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int i =right;i>=left;i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Spiral(mat);
    }
}
