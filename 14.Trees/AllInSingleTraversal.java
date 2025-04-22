import java.util.*;
public class AllInSingleTraversal {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class pair{
        TreeNode node;
        int val;
        pair(TreeNode node, int val){
            this.node = node;
            this.val = val;
        }
    }
    
    public static void Traverse(TreeNode root){
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        Stack<pair> s = new Stack<>();
        s.push(new pair(root,1));
        while(!s.isEmpty()){
            pair sk = s.pop();
            if(sk.val==1){
                pre.add(sk.node.val);
                sk.val++;
                s.push(sk);
                if(sk.node.left!=null){
                    s.push(new pair(sk.node.left,1));
                }

            }
            else if(sk.val==2){
                in.add(sk.node.val);
                sk.val++;
                s.push(sk);
                if(sk.node.right!=null){
                    s.push(new pair(sk.node.right,1));
                }
            }
            else{
                post.add(sk.node.val);
            }
        }
    }
}
