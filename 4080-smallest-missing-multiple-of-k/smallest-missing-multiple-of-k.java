class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean found = false;
        int i = 1;
        int multiple = 0;

        Set<Integer> set = new HashSet<>();
        for (int num: nums)
            set.add(num);
            
        while(!found) {
            multiple = k * i++;
            found = !set.contains(multiple);
        }

        return multiple;       
    }
}