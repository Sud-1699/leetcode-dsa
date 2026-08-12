class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> space = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            /* if(space.containsKey(numbers[i]))
                continue; */
            
            int comp = target - numbers[i];
            if(space.containsKey(comp)) {
                return new int[]{space.get(comp), i + 1};
            }

            space.put(numbers[i], i + 1);
        }

        return new int[]{};
    }
}