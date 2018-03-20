package stringsArrays;

public class UniqueCharecter {


    static boolean isUniqueCharUsingBitVector(String s){

        int checker = 0;
        for (int i = 0;i<s.length();i++) {
            System.out.println(checker);
            int val = s.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0)
                return false;

            checker |= (1 << val);
        }

        return true;
    }

   static boolean isunique(String s){

        if(s.length() > 128)
            return false;
        boolean[] charSet = new boolean[128];
        for (int i = 0;i < s.length();i++){
            int val = s.charAt(i);
            if(charSet[val])
                return false;
            charSet[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {

//        isUniqueChar("apple");
        isunique("apple");
        System.out.println(isUniqueCharUsingBitVector("1 2 2"));
    }
}
