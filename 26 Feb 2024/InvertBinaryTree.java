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
public class InvertBinaryTree{
public static List<Integer> l=new ArrayList<>();
    public static TreeNode invert(TreeNode root){
        if(root==null)
        return null;
        TreeNode n=new TreeNode(root.val);
        n.left=invert(root.left);
        n.right=invert(root.right);
        return n;

    }
    public static List<Integer> inorder(TreeNode root){
        if(root==null)
        return l;
        l.add(root.val);
        inorder(root.left);

        inorder(root.right);
        return l;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(9);
        TreeNode r=invert(root);

        System.out.println(inorder(r));
    }
}