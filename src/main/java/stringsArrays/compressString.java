package stringsArrays;

public class compressString {

    /*
     abbcdddde should be compresed to a1b2c1d3e
     */



    static String compress(String s){

        int repeatedCharCount = 0;
        StringBuilder compressedString = new StringBuilder();

        for(int i =0;i<s.length()-1;i++){
            repeatedCharCount++;
            if(i+1 > s.length() || s.charAt(i)!=s.charAt(i+1)){

                compressedString.append(s.charAt(i));
                compressedString.append(repeatedCharCount);
                repeatedCharCount = 0;
            }
        }
        return compressedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aabccccdeeee0"));
    }
}
