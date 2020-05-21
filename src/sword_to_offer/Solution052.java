package sword_to_offer;

import sword_to_offer.common.ListNode;

public class Solution052 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode la1 = headA, la2 = headA, lb1 = headB, lb2 = headB;
        while (la2 != null && lb2 != null) {
            la2 = la2.next;
            lb2 = lb2.next;
        }
        while (la2 != null) {
            la1 = la1.next;
            la2 = la2.next;
        }
        while (lb2 != null) {
            lb1 = lb1.next;
            lb2 = lb2.next;
        }
        while (la1 != null && lb1 != null) {
            if (la1 == lb1) {
                return la1;
            }
            la1 = la1.next;
            lb1 = lb1.next;
        }
        return null;
    }

}
