package sword_to_offer;

import sword_to_offer.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution032_2 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        List<TreeNode> pList = new ArrayList<>();
        List<TreeNode> sList = new ArrayList<>();
        pList.add(root);
        while (pList.size() > 0) {
            List<Integer> list = new ArrayList<>();
            for (TreeNode p : pList) {
                list.add(p.val);
                if (p.left != null) sList.add(p.left);
                if (p.right != null) sList.add(p.right);
            }
            result.add(list);
            pList = sList;
        }
        return result;
    }

}
