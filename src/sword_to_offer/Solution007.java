package sword_to_offer;

import sword_to_offer.common.ListNode;
import sword_to_offer.common.TreeNode;

import java.util.Arrays;

public class Solution007 {

    public TreeNode buildTree(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
        if (pe - ps < 1) return  null;
        TreeNode node = new TreeNode(preorder[ps]);
        if (pe - ps == 1) return node;
        int i = 0;
        while (i < pe - ps) {
            if (inorder[is + i] == preorder[ps])
                break;
            i++;
        }
        node.left = buildTree(preorder, ps + 1, ps + 1 + i, inorder, is, is + i);
        node.right = buildTree(preorder, ps + 1 + i, pe, inorder, is + i + 1, ie);
        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
      return buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public static void main(String[] args) {
        Solution007 s = new Solution007();
        int[] a = {3,9,20,15,7};
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, 2, 2)));
    }

}
