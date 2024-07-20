import org.junit.Test;
import pers.lilpen.substring.MaxSlidingWindow_LeetCode_239;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/20 14:10
 */
public class TestSubstring {
    @Test
    public void test_maxSlidingWindow_LeetCode_239() {
        MaxSlidingWindow_LeetCode_239 maxSlidingWindow = new MaxSlidingWindow_LeetCode_239();
        int[] ints = maxSlidingWindow.maxSlidingWindow(new int[]{9, 10, 9, -7, -4, -8, 2, -6}, 5);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }
}