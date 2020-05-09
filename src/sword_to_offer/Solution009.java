package sword_to_offer;

import java.util.Stack;

public class Solution009 {

    public static void main(String[] args) {
        Solution009 s = new Solution009();
    }

}

class CQueue {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public CQueue() {
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        int reslut;
        if (s1.empty()) return -1;
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        reslut = s2.pop();
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return reslut;
    }
}