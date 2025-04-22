import java.util.*;
public class DFSTraversal {
    public static List<Integer> dfs(int V,List<Integer> adj[]){
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[V];
        s.push(0);
        visited[0]=true;
        while(!s.isEmpty()){
            int node = s.pop();
            ans.add(node);
            for(int i : adj[node]){
                if(visited[i]==false){
                    visited[i]=true;
                    s.push(i);
                }
            }
        }
        return ans;
    }
}
