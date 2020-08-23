package leetCodePractice;

import java.util.ArrayList;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x){
        val = x;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void midSort(TreeNode root){
        if(root==null)return;
        midSort(root.left);
        System.out.print(root.val+"-->");
        midSort(root.right);
    }




    


}
