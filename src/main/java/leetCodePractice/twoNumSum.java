package leetCodePractice;

import java.util.HashMap;
import java.util.Map;

public class twoNumSum {



    //暴力循环
    public int[] numSum(int[] num, int target){
        int[] targetArray = new int[2];
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    targetArray[0] = i;
                    targetArray[1] = j;
                }
            }
        }

        return targetArray;
    }

    //hashMap
    public int[] numSumHash(int[] num, int target){

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<num.length;i++){
            if(map.containsKey(target-num[i])){
                return new int[] {map.get(target-num[i]),i};
            }
            map.put(num[i],i);
        }
        throw new IllegalArgumentException("no two sum solution");

    }

}
