import java.util.*;
public class IterativeInOrder1stack {
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
    public static List<Integer> InOrder(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        TreeNode node = root;
        Stack<TreeNode> s = new Stack<>();
        while(true){
            if(node!=null){
                s.push(node);
                node = node.left;
            }
            else{
                if(s.isEmpty()){
                    break;
                }
                node = s.pop();
                ans.add(node.val);
                node = node.right;
            }
        }
        return ans;
    }
}
