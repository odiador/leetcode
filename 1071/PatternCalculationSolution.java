class Solution {
    // 1ms | 42.21MB (actually not mine)
    public String gcdOfStrings(String str1, String str2) {
        if (str1.charAt(0) != str2.charAt(0))
            return "";
        int gcd = gcd(str1.length(), str2.length());
        String pat = str1.substring(0, gcd);
        if (val(str1, pat) && val(str2, pat))
            return pat;
        return "";
    }

    public boolean val(String s, String pat) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            sb.append(pat);
        }
        return sb.toString().equals(s);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}