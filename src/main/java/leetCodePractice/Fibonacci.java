package leetCodePractice;

public class Fibonacci {


    public int fib(int n){
         int fibNum[] = new int[n+1];
         for(int i=0;i<n+1;i++){
             fibNum[i]=0;
         }
         return getFib(n,fibNum);

    }

    public int getFib(int n,int[] fibNum){
        if(n==1||n==2) return 1;
        if(fibNum[n]!=0)return fibNum[n];
        fibNum[n] = getFib(n-1,fibNum) + getFib(n-2,fibNum);
        return fibNum[n];

    }

    public int getFibDP(int n){
        int[] dptable = new int[n+1];
        dptable[1] = 1;
        dptable[2] = 1;
        for(int i=3;i<n+1;i++){
            dptable[i] = dptable[i-1] + dptable[i-2];
        }
        return dptable[n];
    }

    public static void main(String[] args){
        Fibonacci test = new Fibonacci();
        System.out.println("fibNum: " +test.fib(10));
        System.out.println("dptable: "+test.getFibDP(10));
    }
}
