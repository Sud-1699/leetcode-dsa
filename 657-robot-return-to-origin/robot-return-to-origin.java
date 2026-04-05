class Solution {
    public boolean judgeCircle(String moves) {
        /* int origin = 1;

        for(int i = 1; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    if(moves.charAt(i - 1) == 'D')
                        origin--;
                    else
                        origin++;
                    break;
                case 'D':
                    if(moves.charAt(i - 1) == 'U')
                        origin--;
                    else
                        origin++;
                    break;
                case 'R':
                    if(moves.charAt(i - 1) == 'L')
                        origin--;
                    else
                        origin++;
                    break;
                default:
                    if(moves.charAt(i - 1) == 'R')
                        origin--;
                    else
                        origin++;
                    break;
            }
        }

        return origin == 0; */

        int r = 0, l = 0, u = 0, d = 0;
        for(int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    u++;
                    break;
                case 'D':
                    d++;
                    break;
                case 'R':
                    r++;
                    break;
                default:
                    l++;
                    break;
            }
        }

        return r == l && u == d;
    }
}