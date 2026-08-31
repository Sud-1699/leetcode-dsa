class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        for(count = 0; count < n; count++) {
            n &= n - 1;
        }

        return count;
    }
}