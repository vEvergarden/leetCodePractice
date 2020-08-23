package leetCodePractice.test;

import java.util.ArrayList;
import java.util.Arrays;

public class testMain {
    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5};
//        int[] dp = new int[a.length];
//        dp[0] = a[0];
//        for(int i=1;i<a.length;i++){
//            dp[i] = dp[i-1]*a[i];
//
//        }
//        int[] dp2  = new int[a.length];
//        dp2[a.length-1] = a[a.length-1];
//        for(int i=a.length-2;i>=0;i--){
//            dp2[i] = a[i]*dp2[i+1];
//
//        }
//        int[] b = new int[a.length];
//        b[0] = dp2[0];
//        b[a.length-1] = dp2[a.length-1];
//        for(int i=1;i<a.length-2;i++){
//            b[i] = dp[i-1]*dp2[i+1];
//
//        }
//        for(int i=0;i<a.length;i++){
//            System.out.print(dp[i]+" ");
//        }
//        System.out.println();
//        for(int i=0;i<a.length;i++){
//            System.out.print(dp2[i]+" ");
//        }
//        System.out.println();
//        for(int i=0;i<a.length;i++){
//            System.out.print(b[i]+" ");
//        }

        TreeNode root = new TreeNode(3);

        root.right = new TreeNode(20);

        root.right.right = new TreeNode(7);

        testMain test = new testMain();
        System.out.println(test.isBalanced(root));


    }
    public boolean isBalanced(TreeNode root) {

        int left = 1;
        int right = 1;

        if(root==null)return false;
        if(root.left==null &&root.right==null)return true;
        if(root.left!=null)left = depthTree(root.left,left);
        if(root.right!=null)right = depthTree(root.right,right);
        if(Math.abs(left-right)>1)return false;
        else return true;


    }


    public int depthTree(TreeNode root,int depth){

        int leftDepth =depth;
        int rightDepth = depth;
        if(root.left == null && root.right==null) return depth;
        if(root.left!=null)leftDepth = depthTree(root.left,++leftDepth);
        if(root.right!=null)rightDepth  =  depthTree(root.right,++rightDepth);
        return Math.max(leftDepth,rightDepth);

    }

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

    }
}
