public class DiameterOfBinaryTree {
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
    static int diameter = 0;
    public static int diameter(TreeNode root){
        diameter = 0;
        helper(root);
        return diameter;
    }
    public static int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = helper(root.left);
        int rh = helper(root.right);
        diameter = Math.max(diameter,lh+rh);
        return 1+Math.max(lh,rh);
    }
}
