class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char letter = letters[0];
        for(int i = 0; i < letters.length; i++) {
            if(target < letters[i]) {
                letter = letters[i];
                break;
            }
        }

        return letter;
    }
}