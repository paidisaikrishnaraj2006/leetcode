class Solution {
    public boolean isPalindrome(String s) {
        String orig = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String rev = new StringBuilder(orig).reverse().toString();

        return orig.equals(rev);
    }
}
