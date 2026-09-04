class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int max = nums[i];


            for(int j = 0; j < i; j++) {
                max = Math.max(nums[j], max);
            }

            for(int m = i; m < nums.length; m++) {
                min = Math.min(nums[m], min);
            }

            if((max - min) <= k) {
                return i;
            }
        }

        return -1;
    }
}