class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i = 0;
        int j = a.length - 1;
        while (i < j && j >= 0 && i < a.length) {
            boolean isi = isBowel(a[i]), isj = isBowel(a[j]);
            if (!isi)
                i++;
            if (!isj)
                j--;
            if (isi && isj) {
                char x = a[i];
                a[i] = a[j];
                a[j] = x;
                i++;
                j--;
            }
        }
        return String.valueOf(a);
    }

    private boolean isBowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}