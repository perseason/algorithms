package pers.lilpen.array;

/**
 * @author : phs
 * @version : 1.0
 * @date : 2024/8/1 22:18
 */
public class Rotate_LeetCode_189 {
    public void rotate(int[] nums, int k) {
        if (nums.length == 1 || nums.length ==0) {
            return;
        }
        for (int i = 0; i < k; i++) {
            int cur = nums[nums.length - 1];
            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
            nums[0] = cur;
        }
    }
}
