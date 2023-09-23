package LeetCode.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    List<List<Integer>> ans = new ArrayList<>();

    public void combine(int i, int n, int k, List<Integer> temp){
        if(k == 0){
            ans.add(new ArrayList(temp));
            return ;
        }
        if(i > n){
            return ;
        }
        combine(i+1, n, k, temp);
        temp.add(i);
        combine(i+1, n, k-1, temp);
        temp.remove(temp.size()-1);  
    }
    public List<List<Integer>> generateCombinations(int n, int k){
        List<Integer> temp = new ArrayList<>();
        combine(1, n, k, temp);
        return ans ;
    }

    public static void main(String[] args) {
        Combinations obj = new Combinations();
        int n = 4; 
        int k = 2;
        System.out.println(obj.generateCombinations(n, k));
    }
}
