package pers.lilpen.array;

/**
 * @author : phs
 * @version : 1.0
 * @date : 2024/8/1 22:18
 */
public class Rotate_LeetCode_189 {
    public void rotate(int[] nums, int k) {
        if (nums.length == 1 || nums.length == 0) {
            return;
        }
        k = k >= nums.length ? k % nums.length : k;
        int[] tmp = new int[k];
        //[1, 2, 3, 4]
        int idx = nums.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            tmp[i] = nums[idx--];
        }
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        System.arraycopy(tmp, 0, nums, 0, k);
    }
}
