class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        Set<Integer> uniques = new HashSet<>();
        for(int num: nums) {
            uniques.add(num);
        }

        int total = nums[0];
        for(int i = 1; i < n; i++) {
            if(nums[i] != (nums[i - 1] + 1)) {
                break;
            } else {
                total += nums[i];
            }
        }

        while(uniques.contains(total)) {
            total += 1;   
        }

        return total;
    }
}