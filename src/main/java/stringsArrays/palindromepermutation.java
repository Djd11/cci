package stringsArrays;

public class palindromepermutation {

    /*
    check the occurance of each charecters, it should be even number and one max odd number
    steps : build charecter frequency, then check for max one odd
     */


    static boolean isPalindromePermutation(String phrase) {

        int[] table = new int[Character.getNumericValue('z')
                - Character.getNumericValue('a')];
        int oddCount = 0;
        for (char c : phrase.toCharArray()) {

            int x = Character.getNumericValue(c);
            System.out.println(x);
            if(x!= -1) {
                table[x]++;
                if (table[x] % 2 == 1)
                    oddCount++;
                else
                    oddCount--;
            }
        }
        return oddCount <= 1;

    }

    public static void main(String[] args) {

        System.out.println(isPalindromePermutation("aab ba a"));
    }
}
