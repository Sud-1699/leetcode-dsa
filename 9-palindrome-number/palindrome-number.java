class Solution {
    public boolean isPalindrome(int x) {
        String left = Integer.toString(x);
        String right = new StringBuilder(left).reverse().toString();

        return left.equals(right);
    }
}