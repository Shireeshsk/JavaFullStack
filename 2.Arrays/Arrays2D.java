import java.util.*;
public class Arrays2D{
    public static void main(String args[]){
        int[][] matrix = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(matrix.length);// gives number of rows
        System.out.println(matrix[0].length);//gives number of columns
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
