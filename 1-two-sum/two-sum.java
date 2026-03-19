class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        boolean isMatch = false;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if(sum == target) {
                    indices[0] = i;
                    indices[1] = j;
                    isMatch = true;
                    break;
                }
            }
            if(isMatch)
                break;
        }

        return indices;
    }
}