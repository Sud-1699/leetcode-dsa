class Solution {
    public String reverseWords(String s) {
        int l = s.length() - 1;
        int r = s.length() - 1;

        StringBuilder result = new StringBuilder();
        while(l >= -1) {
            while(r >= 0 && s.charAt(r) == ' ') {
                r--;
                l = r;
            }

            if(l >= 0 && s.charAt(l) != ' ') {
                l--;
            }
            else {
                int tempL = l + 1;

                while(tempL <= r) {
                    result.append(s.charAt(tempL));

                    tempL++;
                }

                
                result.append(" ");

                l--;
                r = l;
            }
        }

        return result.toString().trim();
    }
}