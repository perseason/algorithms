import org.junit.Test;
import pers.lilpen.binarytree.ConstructMaximumBinaryTree_LeetCode_654;

/**
 * @author : penghuaishun
 * @version : 1.0
 * @date : 2024-07-23 13:32
 **/
public class TestBinaryTree {

    @Test
    public void test_constructMaximumBinaryTree() {
        ConstructMaximumBinaryTree_LeetCode_654 constructMaximumBinary = new ConstructMaximumBinaryTree_LeetCode_654();
        constructMaximumBinary.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
    }
}
