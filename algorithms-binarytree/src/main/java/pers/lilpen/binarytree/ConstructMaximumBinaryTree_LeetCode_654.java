package pers.lilpen.binarytree;

/**
 * @author : penghuaishun
 * @version : 1.0
 * @date : 2024-07-23 10:21
 **/
public class ConstructMaximumBinaryTree_LeetCode_654 {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int maxNumIdx = findMaxNumIdx(nums);
        TreeNode root = new TreeNode(nums[maxNumIdx]);
        int[] leftNums = new int[maxNumIdx];
        int[] rightNums = new int[nums.length - maxNumIdx - 1];
        System.arraycopy(nums, 0, leftNums, 0, maxNumIdx);
        System.arraycopy(nums, maxNumIdx + 1, rightNums, 0, nums.length - maxNumIdx - 1);

        root.left = constructMaximumBinaryTree(leftNums);
        root.right = constructMaximumBinaryTree(rightNums);

        return root;
    }

    private int findMaxNumIdx(int[] num) {
        int max = Integer.MIN_VALUE;
        int maxIdx = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

}
