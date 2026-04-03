class Solution {
    public int countSegments(String s) {
        int words = 0, length = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.substring(i, i+1).equals(" ")) {
                if(length > 0) words += 1;
                length = 0;
            } else {
                length++;
            }            
        }

        if(length > 0) {
            words += 1;
            length = 0;
        }

        return words;
    }
}