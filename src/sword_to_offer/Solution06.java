package sword_to_offer;

import sword_to_offer.common.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution06 {

    private int[] result;
    private int size = 0;
    private int i = 0;

    public void reversePrintAction(ListNode head) {
        if (head == null) {
            result = new int[size];
            return;
        }
        size++;
        reversePrintAction(head.next);
        result[i++] = head.val;
    }

    public int[] reversePrint(ListNode head) {
        reversePrintAction(head);
        return result;
    }

    public static void main(String[] args) {
        Solution06 s = new Solution06();
    }

}
