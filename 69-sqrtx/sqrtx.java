class Solution {
    public int mySqrt(int x) {
        // for 0 and 1, the square roots are themselves
        if (x < 2)
        return x;

        // considering the equation values
        double y = x;
        double z = (y + (x / y)) / 2;

        // as we want to get upto 5 decimal digits, the
        // absolute difference should not exceed 0.00001
        while (Math.abs(y - z) >= 0.00001) {
            y = z;
            z = (y + (x / y)) / 2;
        }
        return (int) z;
    }
}