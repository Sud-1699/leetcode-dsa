class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            int l = 0;
            int r = ints.length - 1;

            while (l <= r) {
                int m = (l + r) / 2;
                if (ints[m] == target) {
                    return true;
                } else if (target < ints[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }

        return false;
    }
}