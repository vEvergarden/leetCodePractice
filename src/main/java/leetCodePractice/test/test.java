package leetCodePractice.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test {
    //二维数组
    //二叉树最后一层是二维数组的第一行
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    ArrayList<List<Integer>> arrayList = new ArrayList<>();
    public int[][] levelOrder(TreeNode root){
        int treeDepth = 0;
        if(root!=null)  treeDepth = levelOrderHelper(root,1);
        int[][] nums = new int[treeDepth][];

        return null;

    }

    public int levelOrderHelper(TreeNode root,int depth){

        int leftDepth = depth;
        int rightDepth = depth;
        if(root==null)return -1;
        if(root.left==null && root.right==null)return depth;
        int lDepth = levelOrderHelper(root.left,++leftDepth);
        int rDepth = levelOrderHelper(root.right,++rightDepth);
        return Math.max(lDepth,rDepth);

    }

    //有序数组 重复元素 最小坐标和最大坐标
    public void sortNUms(int x,int[] nums){
        HashMap<Integer,Integer> start = new HashMap<>();
        HashMap<Integer,Integer> ending = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!start.containsKey(nums[i]))start.put(nums[i],i);
            ending.put(nums[i],i);

        }
        int min = start.get(x);
        int max = ending.get(x);
    }

    public void sortNUms2(int x,int[] nums){
        int l = 0;
        int r = nums.length-1;
        while(l<r){

            if(nums[l]!=x)l++;
            if(nums[r]!=x)r--;
            if(nums[l]==x && nums[r]==x)break;

        }
    }
    int min,max;
    public void sortNums3(int x,int[] nums,int start,int end){
        int l=start;
        int r = end;
        int mid = (l+r)/2;
        l = mid;
        r = mid;
        if(mid==x){
            while(l>=0 && r<nums.length){
                if(nums[l]==x)l--;
                if(nums[r]==x)r++;
            }
            min = l+1;
            max = r-1;

        }
        if(mid>x){
            l=start;
            r=mid-1;
            sortNums3(x,nums,l,r);
        }
        if(mid<x){
            l=mid+1;
            r=end;
            sortNums3(x,nums,l,r);
        }
    }
}
