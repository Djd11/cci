package stringsArrays;

public class Permutation {

    static boolean permutation (String s,String t){

        //find number of time each char seen
        // then compare two arrays

        if(s.length() != t.length())
            return false;
        int []letterCount = new int[128];

        char[] chars = s.toCharArray();

        for(char c : chars)
            letterCount[c]++;

        for (int i=0 ; i< t.length();i++){

            int c = t.charAt(i);
            letterCount[c]--;
            if(letterCount[c]<0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(permutation("abc","abd"));
    }
}
