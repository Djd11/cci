package MH;

import java.util.HashSet;
import java.util.Set;

public class ReplaceAtMostKTimes {

    int replaceAndFindMaxSubstring(String s, int ktimes){

        int answer = 0;
        Set<Character> set = new HashSet<Character>();
        set.add(s.charAt(0));
        for(int i = 0;i<=ktimes;i++){
            if(!set.contains(s.charAt(i++))){

                set.add(s.charAt(i));

            }

        }
        return answer=set.size();
    }

    public static void main(String[] args) {
        ReplaceAtMostKTimes x = new ReplaceAtMostKTimes();
        String s = "ABAB";
        System.out.println(x.replaceAndFindMaxSubstring(s,2));
    }
}
