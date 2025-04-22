import java.util.*;
public class DFSRecursion {
    public static List<Integer> dfs(int V,List<Integer> adj[]){
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];
        helper(visited,ans,0,adj);
        return ans;
    }
    public static void helper(boolean[] visited,List<Integer> list,int node,List<Integer> adj[]){
        visited[node] = true;
        list.add(node);
        for(int i:adj[node]){
            if(visited[i]==false){
                helper(visited,list,i,adj);
            }
        }
    }
}
