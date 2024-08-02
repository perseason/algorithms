package pers.lilpen.binarytree;

/**
 * @author : penghuaishun
 * @version : 1.0
 * @date : 2024-07-23 14:40
 **/
public class MergeTrees_LeetCode_617 {
    public class TreeNode {
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

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        int curNodeNum;
        if (root1 == null || root2 == null) {
            curNodeNum = root1 == null ? root2.val : root1.val;
        } else {
            curNodeNum = root1.val + root2.val;
        }

        TreeNode root = new TreeNode(curNodeNum);
        root.left = mergeTrees(root1 == null ? null : root1.left, root2 == null ? null : root2.left);
        root.right = mergeTrees(root1 == null ? null : root1.right, root2 == null ? null : root2.right);

        return root;
    }
}
