package LeetCode.BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneCombination {

    public List<String> phoneCombination(String digits){
        List<String> combinations = new ArrayList<>();

        HashMap<Character, String> letters = new HashMap<>();
        letters.put('2', "abc");
        letters.put('3', "def");
        letters.put('4', "ghi");
        letters.put('5', "jkl");
        letters.put('6', "mno");
        letters.put('7', "pqrs");
        letters.put('8', "tuv");
        letters.put('9', "wxyz");

        if(digits.length() == 0){
            return combinations ;
        }

        StringBuilder temp = new StringBuilder() ;

        backTrack(0, digits, temp, letters, combinations) ;

        return combinations ;
    }

    public void backTrack(int index, String digits,  StringBuilder temp, HashMap<Character, String> letters, List<String> combinations){
        if(index >= digits.length()) {
            combinations.add(temp.toString());
            return;
        }

        char num = digits.charAt(index);
        String str = letters.get(num) ;
        for(int i = 0 ; i < str.length() ; i++ ) {
                temp.append(str.charAt(i));
                backTrack(index + 1, digits, temp, letters, combinations);
                temp.deleteCharAt(temp.length() - 1) ;
        }
        

    }

    public static void main(String[] args) {
        PhoneCombination obj = new PhoneCombination();
        String digits = "23" ;
        List<String> res =  obj.phoneCombination(digits) ;
        System.out.println(res);
    }
}
