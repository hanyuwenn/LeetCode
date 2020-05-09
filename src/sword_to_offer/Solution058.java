package sword_to_offer;

public class Solution058 {

    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }

    public static void main(String[] args) {
        Solution058 s = new Solution058();
        System.out.println(s.reverseLeftWords("lrloseumgh", 6));
    }

}
