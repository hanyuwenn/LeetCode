package sword_to_offer;

import java.util.Arrays;

public class Solution017 {

    public int[] printNumbers(int n) {
       int[] a = new int[(int) Math.pow(10, n) - 1];
       for (int i = 0; i < a.length; i++) {
           a[i] = i + 1;
       }
       return a;
    }

    public static void main(String[] args) {
        Solution017 s = new Solution017();
        System.out.println(Arrays.toString(s.printNumbers(3)));
    }

}
