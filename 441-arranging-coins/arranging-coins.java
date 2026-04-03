class Solution {
    public int arrangeCoins(int n) {
        int arrange = 0, i = 1;

        /* for(int i = 1; i <= n; i++) {
            if(coins < 0) {
                break;
            }

            coins -= i;
            arrange++;
        } */
        do {
            n -= i;
            i++;
            if(n >= 0) arrange++;
        }
        while (n >= 0);
        
        return arrange;
    }
}