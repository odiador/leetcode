public class CharArray {
    // improvement: 14ms -> 6ms | 42.6MB -> 42.5MB 
    public String longestPalindrome(String s) {
        char[] a = s.toCharArray();
        final int l = a.length;
        if (s == null || l <= 1)
            return s;
        int max = 1;
        int im = 0;
        for (int i = 0; i < l; i++) {
            int o = palSize(a, i, i, l);
            int e = palSize(a, i, i + 1, l);
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

    public int palSize(final char[] a, int left, int right, int l) {
        while (left >= 0 && right < l && a[left] == a[right]) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}