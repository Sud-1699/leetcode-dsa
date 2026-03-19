class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target < nums[0]) {
            return 0;
        }
        
        if(target > nums[nums.length - 1]) {
            return nums.length;
        }

        for(int i = 0; i < nums.length; i++) {
            if((nums[i] == target) || (target < nums[i])) {
                return i;
            }
        }

        return 0;
    }
}