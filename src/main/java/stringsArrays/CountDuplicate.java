package stringsArrays;

public class CountDuplicate {


    static boolean hasDuplicateChar(String s){

        int[] letterCounts = new int[128];
        int duplicateCount =0;
        char[] cArr = s.toCharArray();

        for (int i =0;i<s.length();i++){

            int val = s.charAt(i);
            letterCounts[val]++;
            if(letterCounts[val] >1) {
                System.out.println("Char "+s.charAt(i) +" seen : "+letterCounts[val]+ " times");
                duplicateCount++;
            }
        }

        return duplicateCount >=1;
    }

    public static void main(String[] args) {

        System.out.println(hasDuplicateChar("aaplee333"));
    }
}
