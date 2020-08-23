package leetCodePractice;

import java.util.LinkedList;

public class cirlce {

    public int lastRemaining(int n, int m) {

        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = i;
        }

        int flag = -1;
        int count = n;
        while(count>1){

            //if(flag==0)flag = (flag+m-1)%n;
            flag = (flag+m)%n;

            if(nums[flag]==-1)break;

            if(nums[flag]!=-1)
            {
                nums[flag] = -1;
                count--;
            }

        }
        return flag;


    }

    public static void main(String[] args) {
        cirlce test = new cirlce();
        test.lastRemaining(10,17);
        LinkedList<Integer> linkedList = new LinkedList<>();
        String r = " ";

    }

}
