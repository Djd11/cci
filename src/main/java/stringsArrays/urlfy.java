package stringsArrays;

public class urlfy {

    static char[] replaceSpace(char[] str,int length){


        int spaceCount =0;
        //find the number of spaces
        for(char c : str){

            if(c == ' ')
              spaceCount++;
        }

        int finalLength = length + 2*spaceCount;
        System.out.println("Old size"+ length+"\nNew size: "+finalLength);

        str[finalLength--] = '\0';
        for(int i = length-1;i>=0;i--){

            if (str[length-1] == ' '){

                str[finalLength -1] = '2';
                str[finalLength -2] = '0';
                str[finalLength -3] = '%';
                finalLength = finalLength - 3;

            }else {
                str[finalLength -1] = str[i];
                finalLength--;

            }

        }
        return str;
    }





    public static void main(String[] args) {
       char[] c = "h i".toCharArray();
       replaceSpace(c,3);
        System.out.println(c);
    }
}
