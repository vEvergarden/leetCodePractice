package leetCodePractice;

import java.util.LinkedList;
import java.util.Queue;

public class hasPathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){

        }

        TreeNode(int x) {
            val = x;
        }
    }

    //普通递归
    public boolean toHasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        if (root.left == null && root.right == null)
            return sum - root.val == 0;

        return toHasPathSum(root.left, sum - root.val) || toHasPathSum(root.right, sum - root.val);


    }

    //广度优先 使用队列存储
    public boolean toHasPathSum2(TreeNode root, int sum) {
        if (root == null) return false;

        Queue<TreeNode> queNode = new LinkedList<TreeNode>();
        Queue<Integer> queVal = new LinkedList<Integer>();
        queNode.offer(root);
        queVal.offer(root.val);
        while (!queNode.isEmpty()) {

            TreeNode now = queNode.poll();
            int temp = queVal.poll();
            if (now.left == null && now.right == null) {
                if (temp == sum) return true;
                continue;
            }


            if (now.left != null) {
                queNode.offer(now.left);
                queVal.offer(temp + now.left.val);
            }

            if (now.right != null) {
                queNode.offer(now.right);
                queVal.offer(temp+now.right.val);
            }

        }
        return  false;


    }

}
