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
       /*  do {
            n -= i;
            i++;
            if(n >= 0) arrange++;
        }
        while (n >= 0); */
        
        return arrange;
    }
}