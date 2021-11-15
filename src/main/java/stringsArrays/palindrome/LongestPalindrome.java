package stringsArrays.palindrome;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public static void main(String[] args) {
       // LongestPalindrome.soln("abccccdd");
//        LongestPalindrome.soln("a");
    //    LongestPalindrome.soln("bbb");
        //LongestPalindrome.R1("abccccdd");
        LongestPalindrome.R1("b");
    }

    static int soln(String s){


        /*
            find char frequency
            if odd and one add it to the count
            else 1 less than odd count

            if even add count to longest
         */

        //1 <= s.length <= 2000
        //sanity

        if(1 <= s.length() && s.length() <= 2000) {


            // R : 2
            Map<Character, Integer> chars = new HashMap<Character, Integer>();

            for (Character c : s.toCharArray()) {
                if (!chars.keySet().contains(c)) {
                    chars.put(c, 1);
                } else {
                    chars.put(c, chars.get(c) + 1);
                }
            }
            int maxCount=0;
            // max len is even or odd a or b ) a :
            for (Map.Entry entry : chars.entrySet()) {
                Integer c = (Integer) entry.getValue();
                maxCount = maxCount + c/2 * 2;
                if(maxCount % 2 ==0 && c%2 ==1){
                    maxCount++;
                }
            }
            System.out.println(maxCount);
            return maxCount;
        }
        return s.length();
    }

    static int R1(String s){

        char [] count = new char [128];
        for(Character c : s.toCharArray()){
            count[c]++;
        }
        /*
            summarise
            1. max value  = max value + current value
            2.
         */
        int maxValue=0;
        for(int i=0;i<count.length ;i++){

            // odd (3/2 1) (5/2 2) (7/2 3) multiplied 2 ie 2 is add in case of odd
            // 5


            // even (2/2 1) (4/2 2) (6/2 3)

            maxValue = maxValue + count[i]/2 * 2;



            // when max is even and current char count is odd then incr max by 1
            // 2 aa b 1 aba , 3
            // 4 aaaa b 1 aabaa , 5
            if(maxValue%2==0 && count[i]%2==1){
                maxValue++;
            }
        }
        System.out.println("Input :"+s+" "+maxValue);
        return maxValue;
    }
}
