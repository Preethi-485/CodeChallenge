import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){

    }
    TreeNode(int val){
        this.val=val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public class HeightOfBinaryTree{
    public static void main(String[] args) {
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(10);
        root.right=new TreeNode(100);
        root.left.left=new TreeNode(20);
        root.left.right=new TreeNode(800);
        System.out.println(height(root));
    }
    public static int height(TreeNode root){
        if(root==null)
        return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}