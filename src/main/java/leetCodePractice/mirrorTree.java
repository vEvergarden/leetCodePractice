package leetCodePractice;

import sun.reflect.generics.tree.Tree;

public class mirrorTree {

    mirrorTree(){}

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public TreeNode mirrorTree(TreeNode root){
        if(root==null)return null;
        else{
            TreeNode newRoot = root;
            newRoot.left = mirrorTree(root.right);
            newRoot.right = mirrorTree(root.left);
            return newRoot;
        }
    }

    public static void main(String[] args){
        TreeNode head;
        TreeNode root = new TreeNode(4);
        head = root;
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root = root.left;
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root = head.right;
        root.left = new TreeNode(6);
        root.right = new TreeNode(9);

        mirrorTree test = new mirrorTree();

        TreeNode n = test.mirrorTree(head);
        while(n!=null){
            System.out.print(n.left);
            
        }
    }

}

