class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = Arrays.stream(strs)
        .collect(Collectors.groupingBy(
                word -> word.chars().sorted()
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
        ));

        return anagrams.values().stream().toList(); 
    }
}