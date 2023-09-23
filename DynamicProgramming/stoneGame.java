package LeetCode.DynamicProgramming;

public class stoneGame {

    private int stoneGameResults(int n, int [] piles, int left, int right ) {
        int [][]dp = new int[n][n] ;
            for (int g = 0 ; g < dp.length ; g++) {
                for (int i = 0 , j = g ; j < dp.length ; i++, j++) {
                    if(g == 0) {
                        dp[i][j] = piles[i] ;
                    }
                    else if(g == 1) {
                        dp[i][j] = Math.max(piles[i] , piles[j]) ;
                    }
                    else {
                        int v1 = piles[i] + Math.min(dp[i+2][j], dp[i+1][j-1]);
                        int v2 = piles[j] + Math.min(dp[i+1][j-1], dp[i][j-2]);
                        int val = Math.max(v1, v2) ;
                        dp[i][j] = val ;
                    }
                }
            }
            return dp[0][n-1] ;
    }
    public int stoneGame(int[] piles) {
        int n = piles.length ; 
        int left = 0 ; 
        int right = n-1 ;

        // return stoneGameResults(n, piles, left, right) > 0;
        return stoneGameResults(n, piles, left, right) ;
    }

     public static void main(String[] args) {
        int [] nums = {5,3,4,5} ;
        stoneGame s = new stoneGame();
        // boolean ans = s.stoneGame(nums) ;
        int ans = s.stoneGame(nums) ;
        System.out.println(ans);
    }
}
