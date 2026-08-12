class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int ans = 0, l = -1, r = 0;
        while(r < nums.length) {
            frequency.put(nums[r], frequency.getOrDefault(nums[r], 0) + 1);

            while(frequency.get(nums[r]) > k) {
                l++;
                frequency.put(nums[l], frequency.get(nums[l]) - 1);
            }

            ans = Math.max(ans, r - l);
            r++;
        }

        return ans;
    }
}