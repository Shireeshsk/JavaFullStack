import java.util.*;
public class IterativePostOrderStack {
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
    public static List<Integer> postOrder2Stacks(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        TreeNode node = root;
        s1.push(node);
        while(!s1.isEmpty()){
            node = s1.pop();
            s2.push(node);
            if(node.left!=null){
                s1.push(node.left);
            }
            if(node.right!=null){
                s1.push(node.right);
            }
        }
        while(!s2.isEmpty()){
            ans.add(s2.pop().val);
        }
        return ans;
    }

    public static List<Integer> postOrder1Stack(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode node = root;
        while(node!=null || !s.isEmpty()){
            if(node!=null){
                s.push(node);
                node = node.left;
            }
            else{
                TreeNode temp = s.peek().right;
                if(temp==null){
                    temp = s.pop();
                    ans.add(temp.val);
                    while(!s.isEmpty() && temp==s.peek().right){
                        temp = s.pop();
                        ans.add(temp.val);
                    }
                }
                else{
                    node = temp;
                }
            }
        }
        return ans;
    }
}
