public class TilingProblem {
    public static int tiling(int n){
        if(n==1||n==0){
            return 1;
        }
        int verticalTiles = tiling(n-1);
        int horizontalTiles = tiling(n-2);
        int totalways = verticalTiles+horizontalTiles;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(tiling(0));
    }
}
