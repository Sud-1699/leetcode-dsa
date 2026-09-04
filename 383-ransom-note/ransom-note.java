class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> construct = new HashMap<>();
        for(char c: ransomNote.toCharArray()) {
            construct.put(c, construct.getOrDefault(c, 0) + 1);
        }

        for(char c: magazine.toCharArray()) {
            if(!construct.containsKey(c))
                continue;

            construct.put(c, construct.getOrDefault(c, 0) - 1);
        }

        int canConstruct = 0;
        for(Map.Entry<Character, Integer> entry: construct.entrySet()) {
            if(entry.getValue() > 0)
                canConstruct++;
        }

        return canConstruct == 0;
    }
}