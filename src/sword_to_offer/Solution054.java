package sword_to_offer;

import sword_to_offer.common.TreeNode;

public class Solution054 {

    private int i;
    private int reslut;

    public void kthLargestAction(TreeNode root) {
        if (root == null) return;
        kthLargestAction(root.right);
        if (i == 1) {
            reslut = root.val;
            i--;
            return;
        }
        else if (i > 1) {
            i--;
        }
        else {
            return;
        }
        kthLargestAction(root.left);
    }

    public int kthLargest(TreeNode root, int k) {
        i = k;
        kthLargestAction(root);
        return reslut;
    }

    public static void main(String[] args) {
        Solution054 s = new Solution054();
    }

}
