class Solution {
    public int longestSubsequence(int[] nums) {
        /* int l = 0, r = 1;

        int bitwise = nums[l];
        int max = 0;
        boolean allZero = false;
        while(r < nums.length) {
            bitwise = bitwise ^ nums[r];

            if(bitwise <= 0 && allZero) {
                allZero = true;
                l++;
            }

            r++;
            max = Math.max(max, (r - l));
        }

        return max; */

        int tot = 0, n = nums.length;
        boolean nonZero = false;

        for (int x : nums) {
            nonZero |= x > 0;
            tot ^= x;
        }

        if (!nonZero) return 0;
        return tot == 0 ? n - 1 : n;
    }
}