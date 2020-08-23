import leetCodePractice.TreeNode;
import org.junit.Test;

public class test {

    @Test
    public void mainTest(){
        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(2);
        TreeNode root4 = new TreeNode(3);
        TreeNode root5 = new TreeNode(3);
        TreeNode root6 = new TreeNode(4);
        TreeNode root7 = new TreeNode(4);

        root.setLeft(root2);
        root.setRight(root3);
        root2.setLeft(root4);
        root2.setRight(root6);
        root3.setLeft(root7);
        root3.setRight(root5);

        root.midSort(root);


    }


}
