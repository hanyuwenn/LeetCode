package sword_to_offer;

import java.util.Arrays;

public class Solution039 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
