package sword_to_offer;

import sword_to_offer.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution056_2 {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            }
            else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        System.out.println(map.toString());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (1 == entry.getValue()) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution056_2 s = new Solution056_2();
    }

}
