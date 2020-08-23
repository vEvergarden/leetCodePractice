import leetCodePractice.quickSort;
import org.junit.Test;

public class sortTest {

    @Test
    public void quickSortTest(){
        int[] a = {4,6,7,2,10,15,3};
        quickSort test = new quickSort();
        test.quickSortMain(a,0,6);
        for(int i=0;i<6;i++){
            System.out.print(a[i]+" ");
        }
    }

}
