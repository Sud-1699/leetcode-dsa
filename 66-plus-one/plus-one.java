class Solution {
    public int[] plusOne(int[] digits) {
        int end = digits.length - 1;
        int carry = 1;

        if(digits.length == 1 && digits[0] == 9) {
            return new int[]{1, 0};
        }

        do {
            if(digits[end] == 9 && carry != 0) {
                digits[end] = 0;
                carry = 1;
            } else {
                digits[end] += carry;
                carry = 0;
            }

            end--;
        } while(end >= 0);

        if(carry == 1) {
            int[] finalResult = new int[digits.length + carry];
            finalResult[0] = carry;
            for(int i = 1; i < finalResult.length; i++) {
                finalResult[i] = digits[i - 1];
            }

            return finalResult;
        }

        return digits;
    }
}