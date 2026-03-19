class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) {
            for(int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }

        if(n == 0) {
            return;
        }

        for(int i = 0; i < (m + n); i++) {
            if(i == n) break;
            nums1[i + m] = nums2[i];
        }

        //Perform insertion sort
        for(int i = 0; i < nums1.length; i++) {
            int unsorted = nums1[i];
            int j = i - 1;
            while(j >= 0 && unsorted < nums1[j]) {
                    nums1[j + 1] = nums1[j];
                    j--;
            }

            nums1[j + 1] = unsorted;
        }
    }
}