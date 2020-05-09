package sword_to_offer;

import sword_to_offer.common.ListNode;

public class Solution022 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode n1 = head;
        ListNode n2 = n1;
        while (k > 0 && n2 != null) {
            n2 = n2.next;
            k--;
        }
        if (k > 0) return null;
        while (n2 != null) {
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;
    }

}
