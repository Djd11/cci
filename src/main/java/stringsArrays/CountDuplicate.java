package stringsArrays;

public class CountDuplicate {


    static void hasDuplicateChar(String s){

        int[] letterCounts = new int[128];
        char[] cArr = s.toCharArray();

        for (int i =0;i<s.length();i++){

            int val = s.charAt(i);
            letterCounts[val]++;
            if(letterCounts[val] >1) {
                System.out.println("Char "+s.charAt(i) +" seen : "+letterCounts[val]+ " times");

            }
        }


    }

    public static void main(String[] args) {

        hasDuplicateChar("aaplee333");
    }
}
