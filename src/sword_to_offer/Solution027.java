package sword_to_offer;

import sword_to_offer.common.TreeNode;

import java.util.Arrays;

public class Solution027 {

    public void mirrorTreeA(TreeNode root) {
        if (root == null) return;
        mirrorTreeA(root.left);
        mirrorTreeA(root.right);
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }

    public TreeNode mirrorTree(TreeNode root) {
        mirrorTreeA(root);
        return root;
    }

    public static void main(String[] args) {
        Solution027 s = new Solution027();
    }

}
