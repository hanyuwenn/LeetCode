package sword_to_offer;

import sword_to_offer.common.ListNode;

public class Solution025 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(0);
        ListNode n1 = newList, n2 = l1, n3 = l2;
        while (n2 != null && n3 != null) {
            if (n2.val < n3.val) {
                n1.next = n2;
                n2 = n2.next;
            }
            else {
                n1.next = n3;
                n3 = n3.next;
            }
            n1 = n1.next;
        }
        n2 = n2 != null ? n2 : n3;
        while (n2 != null) {
            n1.next = n2;
            n1 = n1.next;
            n2 = n2.next;
        }
        return newList.next;
    }

    public static void main(String[] args) {
        Solution025 s = new Solution025();
    }

}
