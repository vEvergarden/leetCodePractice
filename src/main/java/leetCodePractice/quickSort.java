package leetCodePractice;

public class quickSort {

    public void quickSortMain(int[] nums,int l,int r){
        //int pivot = getPivot(nums,l,r);
        if(l>=r)return;
        int partition = getPartition(nums,l,r);
        quickSortMain(nums,l,partition-1);
        quickSortMain(nums,partition,r);
    }

    private int getPartition(int[] nums, int l, int r) {
        int pivot = getPivot(l,r);
        //swap(nums,pivot,r);
        int value = pivot;
        //pivot = r;
        int i = l;
        int j = r;
        while(i<j){
            while(i<l && nums[i++]<value);
            while(j>r && nums[j--]>=value);
            swap(nums,i,j);
            if(i>=j)break;
        }
        //swap(nums,pivot,r);
        if(nums[i]>nums[j])swap(nums,i,j);
        return i;
    }

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    private int getPivot(int l,int r) {
        return (l+r)/2;
    }

}
