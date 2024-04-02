import java.util.*;
class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val=val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public class MaxElementInTree{

    public static int max=-1;
    public static int maxEl(TreeNode root){
        if(root==null)
        return -1;
        int l=maxEl(root.left);
        int r=maxEl(root.right);
        max=Math.max(l,r);
        return Math.max(max,root.val);

    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(10);
        root.right=new TreeNode(100);
        root.left.left=new TreeNode(20);
        root.left.right=new TreeNode(800);
        System.out.println(maxEl(root));
        
    }
}