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
public class CheckIfValueIsPresentOrNot{
    public static boolean res=false;
    public static boolean check(TreeNode root,int data){
        if(root==null){
            
            return false;
        }
      
        return (root.val==data || check(root.left,data) || check(root.right,data));
    }

    public static void main(String[] args) {
        
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(10);
        root.right=new TreeNode(100);
        root.left.left=new TreeNode(20);
        root.left.right=new TreeNode(800);
        int data=800;
        System.out.println(check(root,data));
    }
}