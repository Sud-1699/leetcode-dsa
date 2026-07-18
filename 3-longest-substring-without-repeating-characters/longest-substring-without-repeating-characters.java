class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() == 1) {
            return s.length();
        }

        int res = 0;
        Set<Character> seen = new HashSet<>();

        int left = 0, right = 0;
        while(right < s.length()) {
            while(seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(s.charAt(right));
            res = Math.max(res, (right - left) + 1);
            right++;
        }

        return res;
    }
}