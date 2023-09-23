package LeetCode;

// import java.util.ArrayList;
// import java.util.List;

/*
 * 
 * You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
 * 
*/
public class summaryRanges {
    // public List<String> summaryRanges(int []arr) {
        
    //     List<String> ans = new ArrayList<>();

    //     for(int i = 0 ; i < arr.length ; i++) {
    //         int start = arr[i] ;
    //         while(i + 1 < arr.length && arr[i] + 1 == arr[i+1]) {
    //             i++ ; 
    //         }
    //         if(start != arr[i]) {
    //             ans.add(start + "->" + arr[i]) ;
    //         }
    //         else
    //         ans.add(String.valueOf(start));
    //     }
    //     return ans ;
    // }   
    
    // public static void main(String[] args) {
    //     summaryRanges obj = new summaryRanges();
    //     int[] arr = new int[] {0,1,2,4,5,7} ;
    //     for(int x : arr)
    //     System.out.println(x);

    //     System.out.println(obj.summaryRanges(arr));
    // }
}
