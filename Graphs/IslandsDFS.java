public class IslandsDFS{
    public int NumberOfIslands(int[][] grid){
        int c= 0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    c++;
                    dfs(i,j,vis,grid);
                }
            }
        }
        return c;
    }
    public void dfs(int row,int col,boolean[][] vis,int[][] grid){
        vis[row][col] = true;
        int[] idx = {-1,0,1};
        for(int i = 0;i<idx.length;i++){
            for(int j = 0;j<idx.length;j++){
                int nrow = row + idx[i];
                int ncol = col + idx[j];
                if(isValid(row, col, vis, grid)){
                    dfs(nrow,ncol,vis,grid);
                }
            }
        }
        
    }
    public boolean isValid(int row,int col,boolean[][] vis,int[][] grid){
        if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && grid[row][col]==1 && !vis[row][col]){
            return true;
        }
        return false;
    }
}