package sword_to_offer;

import sword_to_offer.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution032_1 {

    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> nodes = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            System.out.println(node.val);
            result.add(node.val);
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        int[] arr = new int[result.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }

}
