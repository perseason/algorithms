package pers.lilpen.array;

import java.util.ArrayList;

/**
 * @author : phs
 * @version : 1.0
 * @date : 2024/7/29 20:31
 */
public class MaxSubArray_LeetCode_53 {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxSum = nums[0];
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            maxSum = Math.max(maxSum, pre);
        }
        return maxSum;
    }
}