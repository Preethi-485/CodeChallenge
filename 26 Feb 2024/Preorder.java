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
public class Preorder{
    public static void preorder(TreeNode root,List<Integer> l){
        if(root==null)
        return;
        l.add(root.val);
        preorder(root.left,l);
        preorder(root.right,l);
    }
   public static void main(String[] args){
    TreeNode root=new TreeNode(10);
    root.left=new TreeNode(6);
    root.right=new TreeNode(4);
    root.left.left=new TreeNode(3);
    root.left.right=new TreeNode(2);
    root.right.left=new TreeNode(1);
    root.right.right=new TreeNode(2);
    List<Integer> l=new ArrayList<>();
    preorder(root,l);
    System.out.println(l);
   } 
}