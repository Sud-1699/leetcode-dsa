class Solution {
    private static final Map<Character, Integer> roman = Map.of('I', 1,'V', 5,'X', 10,'L', 50,'C', 100,'D', 500,'M', 1000);

    public int romanToInt(String s) {
        int sum = 0;
        int temp = 0;
        for(int i = 0; i < s.length(); i++) {
            if(temp == 0)
                temp = roman.get(s.charAt(i));
            else if(temp >= roman.get(s.charAt(i))) {
                sum += temp;
                temp = roman.get(s.charAt(i));
            } else {
                sum += roman.get(s.charAt(i)) - temp;
                temp = 0;
            }
        }

        return sum + temp;
    }
}