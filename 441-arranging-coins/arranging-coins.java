class Solution {
    public int arrangeCoins(int n) {
        int arrange = 0, coins = n;

        for(int i = 1; i <= n; i++) {
            coins -= i;
            if(coins < 0) {
                break;
            }

            arrange++;
        }

        return arrange;
        /* if(n == 1) return n;

        int arrange = 0;
        do {
            arrange++;
            n -= arrange % n;
        }
        while(n > 1);
        
        return arrange - 1; */
    }
}