import java.util.*;
public class Inorder{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){

        }
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val,TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public static void inorder(TreeNode root,List<Integer> l){
        if(root==null)
        return;
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
        //return l;

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
        inorder(root,l);
        System.out.println(l);


    }
}