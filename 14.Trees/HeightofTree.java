import java.util.*;
public class HeightofTree {

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

    public static int height(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return 0;
        }
        q.add(root);
        int c=1;
        while(!q.isEmpty()){
            int idx = q.size();
            for(int i = 0;i<idx;i++){
                TreeNode curr = q.remove();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            c++;
        }
        return c-1;
    }

    public static int height2(TreeNode root){
        if(root==null){
            return 0;
        }

        int lh = height2(root.left);
        int rh = height2(root.right);
        return Math.max(lh,rh)+1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);
        System.out.println(height(root));
        System.out.println(height2(root));
    }
}

