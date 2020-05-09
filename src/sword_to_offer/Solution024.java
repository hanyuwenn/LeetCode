package sword_to_offer;

import sword_to_offer.common.ListNode;

public class Solution024 {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode(0);
        ListNode node = head;
        ListNode tmp = head;
        while (node != null) {
            tmp = node.next;
            node.next = newHead.next;
            newHead.next = node;
            node = tmp;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        Solution024 s = new Solution024();
    }

}
