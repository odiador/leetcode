class Solution {
    // Too much time but accepted (202ms beats 5.05% | 44.9MB beats 9.85%
    public String gcdOfStrings(String str1, String str2) {
        if (str1.charAt(0) != str2.charAt(0))
            return "";
        int i = str1.length();
        while (i > 0) {
            String sub = str1.substring(0, i--);
            if (matches(str1, sub) && matches(str2, sub))
                return sub;

        }
        return "";
    }

    public static boolean matches(String s, String p) {
        return s.matches("(\\Q" + p + "\\E)+");
    }

}