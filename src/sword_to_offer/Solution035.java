package sword_to_offer;

import sword_to_offer.common.ListNode;
import sword_to_offer.common.Node;

import java.util.HashMap;
import java.util.Map;

public class Solution035 {

    private Map<Node, Node> map = new HashMap<>();

    public Node copyLinkedList(Node head) {
        Node newHead = new Node(0);
        Node p = head, q = newHead;
        while (p != null) {
            Node node = new Node(p.val);
            map.put(p, node);
            q.next = node;
            q = q.next;
            p = p.next;
        }
        return newHead.next;
    }

    public Node copyRandomList(Node head) {
        Node newHead = copyLinkedList(head);
        Node p = head, q = newHead;
        while (p != null) {
            q.random = map.get(p.random);
            p = p.next;
            q = q.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        Solution035 s = new Solution035();
    }

}
