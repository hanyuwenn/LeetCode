package sword_to_offer;

public class Solution064 {

    public int sumNums(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Solution064 solution = new Solution064();
        System.out.println(solution.sumNums(9));
    }

}
