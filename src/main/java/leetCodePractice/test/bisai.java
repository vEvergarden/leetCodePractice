package leetCodePractice.test;

public class bisai {
    int res=0;
    int[] dp;
    int[] sum;
    public int stoneGameV(int[] stoneValue) {


        int length = stoneValue.length;
        dp = new int[length];
        sum = new int[length];
        if(length <= 1)return 0;
        res = stoneGameHelper(stoneValue,0,length-1,dp,sum);
        return res;

    }

    public int stoneGameHelper(int[] stoneValue,int start,int end,int[] dp,int[] sum){
        int resTemp=0;
        int length = end-start+1;
        if(length <= 1)return resTemp =stoneValue[start];
        if(length==2)return  resTemp = Math.min(stoneValue[start],stoneValue[end]);
        //int[] dp = new int[length];
        //int[] sum = new int[length];
        sum[start] = stoneValue[start];
        for(int i=start+1;i<start+length;i++){
            sum[i] = sum[i-1] + stoneValue[i];
        }

        int min=Integer.MAX_VALUE;
        int index = 0;

        for(int i=start;i<=start+length-2;i++){
            int temp = Math.abs(sum[end]-sum[i]);
            dp[i] = Math.abs(temp-sum[i]);
            if(dp[i]<min){
                min = dp[i];
                index = i;
            }

        }
        int temp = Math.abs(sum[end]-sum[index]);


        if(sum[index]<temp){
            resTemp += sum[index];
            end = index;
            if(end-start>=1) resTemp += stoneGameHelper(stoneValue,start,end,dp,sum);
        }
        else if(sum[index]>temp){
            resTemp += temp;
            start = index+1;
            if(end-start>=1) resTemp += stoneGameHelper(stoneValue,start,end,dp,sum);
        }

        else if(sum[index]==temp){
            int left=0;
            int right=0;
            left = left+sum[index];
            right = right+Math.abs(sum[end]-sum[index]);
            if(index-start>=1) left += stoneGameHelper(stoneValue,start,index,dp,sum);
            if(end-index>=2)right += stoneGameHelper(stoneValue,index+1,end,dp,sum);

            int equalMin = Math.max(left,right);
            resTemp += equalMin;

        }




        return resTemp;
    }

    public static void main(String[] args) {
        int[] test = new int[]{2,1,1};
        bisai test1 = new bisai();

        System.out.println(test1.stoneGameV(test));
    }
}
