import java.lang.StringBuilder;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int min = word1.length() < word2.length() ? word1.length() : word2.length();
        for (int i = 0; i < min; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        sb.append((word1.length() == min ? word2 : word1).substring(min));
        return sb.toString();
    }
}