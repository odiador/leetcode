class Solution {
    public boolean isPalindrome(int x) {
        String string = x + "";
		return string.equals(new StringBuilder(string).reverse().toString());
    }
}