package sword_to_offer;

import java.util.ArrayList;
import java.util.List;

public class Solution057_2 {

    public int[][] findContinuousSequence(int target) {
        List<MyMap> list = new ArrayList<>();
        float n = 1L;
        float a = 0L;
        while((a = target / (n + 1) - n / 2) >= 1) {
            // System.out.println(a);
            if (a % 1 == 0) {
                list.add(new MyMap((int)a, (int)n));
            }
            n++;
        }
        int[][] result = new int[list.size()][];
        for (int k = 0; k < list.size(); k++) {
            MyMap m = list.get(k);
            int j = m.val;
            int[] arr = new int[j + 1];
            for (int i = 0; i <= j; i++) {
                arr[i] = m.key + i;
            }
            result[result.length - 1 - k] = arr;
        }
        // System.out.println(Arrays.deepToString(result));
        return result;
    }

    public static void main(String[] args) {
        Solution057_2 s = new Solution057_2();
        s.findContinuousSequence(100000);
        System.out.println(1.1 % 1.0);
    }

}

class MyMap {
    int key;
    int val;

    public MyMap(int key, int val) {
        this.key = key;
        this.val = val;
    }
}