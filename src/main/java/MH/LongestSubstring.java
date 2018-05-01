package MH;


import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    /*
         Find longest substring which are non repeating

         Approach
         Technique Sliding window protocol ie start with [i,j) left side close and right side moving
         increment j , Have a set data structure to maintain the longest substring. Have answer placeholder
         which is max of (answer,distance from j to i), if non repeating add the character to the set, in case any repeating character is
         seen remove it from the set

     */

    int longestSubString(String input){

        int answwer = 0;
        int i = 0 ;
        int m = 0;

        Set<Character> characters = new HashSet<Character>();

        int n = input.length();

        while(i < n && m < n){

            if(!characters.contains(input.charAt(m))){

                characters.add(input.charAt(m++));
                answwer = Math.max(answwer,m - i);

            } else {
                characters.remove(input.charAt(i++));
            }

        }

        System.out.println("Longest "+answwer);
        return answwer;
    }

    public static void main(String[] args) {

        LongestSubstring longestSubstring = new LongestSubstring();
        String testInputs = "ababc";
        longestSubstring.longestSubString(testInputs);
    }
}
