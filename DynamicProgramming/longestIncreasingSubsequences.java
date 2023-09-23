package LeetCode.DynamicProgramming;

import java.util.Arrays;

public class longestIncreasingSubsequences {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ;
        int [] lis = new int[n] ;
        //Arrays.fill(lis,1) ;

        for (int i = n-1 ; i > 0 ; i--) {
                        lis[i] = 1;
            for(int j = i + 1 ; j < n ; j++) {
                    if(nums[i] < nums[j]) {
                        lis[i] = Math.max(lis[i] , 1 + lis[j]) ;
                    }
            }
        }
        Arrays.sort(lis) ;
        return lis[0] ;
    }

    public static void main(String[] args) {
        int [] nums = {10,9,2,5,3,7,101,18} ;
        longestIncreasingSubsequences l = new longestIncreasingSubsequences();
       
        System.out.println( l.lengthOfLIS(nums));
    }
}
