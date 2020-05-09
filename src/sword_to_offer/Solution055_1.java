package sword_to_offer;

import sword_to_offer.common.TreeNode;

public class Solution055_1 {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int lDepth = maxDepth(root.left);
        int rDepth = maxDepth(root.right);
        int mDepth = lDepth > rDepth ? lDepth : rDepth;
        return mDepth + 1;
    }

    public static void main(String[] args) {
        Solution055_1 s = new Solution055_1();
    }

}
