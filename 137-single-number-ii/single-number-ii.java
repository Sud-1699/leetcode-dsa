class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if(freq.get(num) <= 2) {
                result ^= num;
            }
        }

        return result;
    }
}