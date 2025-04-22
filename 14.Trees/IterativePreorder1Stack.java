import java.util.*;
public class IterativePreorder1Stack {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> PreOrder(Node root){
        List<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node curr = s.pop();
            ans.add(curr.data);
            if(curr.right!=null){
                s.push(curr.right);
            }
            if(curr.left!=null){
                s.push(curr.left);
            }
        }
        return ans;
    }
}
