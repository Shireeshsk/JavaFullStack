import java.util.*;
public class BFSTraversal {
    public static List<Integer> bfs(int V,List<Integer> adj[]){
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int node = q.remove();
            ans.add(node);
            for(int i : adj[node]){
                if(visited[i]==false){
                    q.add(i);
                    visited[i]=true;
                }
            }

        }
        return ans;
    }
    public static void main(String args[]){
        int V = 5;
        List<Integer>[] adj = new List[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        adj[0].addAll(Arrays.asList(2, 3, 1));
        adj[1].add(0);
        adj[2].addAll(Arrays.asList(0, 4));
        adj[3].add(0);
        adj[4].add(2);
        System.out.println(bfs(V,adj));
    }
}
