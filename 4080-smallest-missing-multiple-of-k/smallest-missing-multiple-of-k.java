class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean found = false;
        int i = 1;
        int multiple = 0;

        Set<Integer> set = Arrays.stream(nums)
                .boxed() // Converts int to Integer
                .collect(Collectors.toSet());
        while(!found) {
            multiple = k * i++;
            found = !set.contains(multiple);
        }

        return multiple;       
    }
}