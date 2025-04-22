import java.util.*;
public class LevelOrderToTree {
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
    public static Node build(int arr[]){
        if(arr.length==0){
            return null;
        }
        int idx = 0;
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(arr[0]);
        q.add(root);
        idx++;
        while(!q.isEmpty() && idx!=arr.length){
            Node curr = q.remove();
            if(arr[idx]!=-1){
                curr.left = new Node(arr[idx]);
                q.add(curr.left);
            }
            idx++;
            if(arr[idx]!=-1){
                curr.right = new Node(arr[idx]);
                q.add(curr.right);
            }
            idx++;
        }
        return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        preOrder(build(arr));
    }
}
