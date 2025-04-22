public class MaximumPathSum {
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

    public static int maxSum(TreeNode root){
        int sum[] = new int[1];
        shireesh(root,sum);
        return sum[0];
    }

    public static int helper(TreeNode root,int sum[]){
        if(root == null){
            return 0;
        }
        int lsum = helper(root.left,sum);
        int rsum = helper(root.right,sum);
        sum[0] = Math.max(sum[0],Math.max(lsum , rsum))+root.val;
        return sum[0];
    }
    static int maxi = Integer.MIN_VALUE;
    public static int shireesh(TreeNode root,int sum[]){
        if(root == null){
            return 0;
        }
        int lsum = shireesh(root.left,sum);
        int rsum = shireesh(root.right,sum);
        int t = lsum + rsum + root.val;
        sum[0] = Math.max(sum[0],t);
        return root.val + Math.max(lsum,rsum);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxSum(root));
        // System.out.println(shireesh(root));
        // System.out.println(shireesh(root,new int[1]));
        // System.out.println(maxi);
    }
}
