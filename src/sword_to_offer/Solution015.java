package sword_to_offer;

import sword_to_offer.common.ListNode;

public class Solution015 {

    public int hammingWeight(int n) {
        System.out.println(n);
        int i = 0;
        while (n != 0) {
            i += n % 2;
            n = n / 2;
        }
        return i;
    }

    public static void main(String[] args) {
        Solution015 s = new Solution015();
        System.out.println(s.hammingWeight(3));
    }

}
