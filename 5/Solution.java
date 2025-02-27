class Solution {
    public String longestPalindrome(String s) {
        final int l = s.length();
        if (s == null || l <= 1)
            return s;
        int max = 1;
        int im = 0;
        for (int i = 0; i < l; i++) {
            int o = palSize(s, i, i, l);
            int e = palSize(s, i, i + 1, l);
            if (o > max) {
                max = o;
                im = i;
            }
            if (e > max) {
                max = e;
                im = i;
            }
        }
        return s.substring(im - max / 2 + (max % 2 == 1 ? 0 : 1), im + max / 2 + 1);
    }

    public int palSize(final String s, int left, int right, int l) {
        while (left >= 0 && right < l && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}