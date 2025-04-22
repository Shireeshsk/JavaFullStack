public class SumOfNodes {
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

    public static int NodeSum(TreeNode root){
        if(root==null){
            return 0;
        }
        int lsum = NodeSum(root.left);
        int rsum = NodeSum(root.right);
        return root.val + lsum + rsum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);
        System.out.println(NodeSum(root));
    }
}
