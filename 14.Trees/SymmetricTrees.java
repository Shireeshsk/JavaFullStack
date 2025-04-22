public class SymmetricTrees {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isSymmetric(TreeNode l , TreeNode r){
        if(l==null && r==null){
            return true;
        }
        if(l==null || r == null){
            return false;
        }
        if(l.data != r.data){
            return false;
        }
        return isSymmetric(l.left, r.right);
    }
}
