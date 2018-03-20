package stringsArrays;
/*

   given a number it should tell column
   A - Z , 0 - 25
   AA - AZ , 26 - 51
 */
public class ExcelN2C {



    public static String getExcelColumnName(int number) {
        final StringBuilder sb = new StringBuilder();

        int num = number - 1;
        while (num >=  0) {
            int numChar = (num % 26)  + 65;
            sb.append((char)numChar);
            num = (num  / 26) - 1;
        }
        return sb.reverse().toString();
    }


    public static int getExcelColumnNumber(String column) {
        int result = 0;
        for (int i = 0; i < column.length(); i++) {
            result *= 26;
            result += column.charAt(i) - 'A' + 1;
        }
        return result;
    }
    public static void main(String[] args) {

//        String x = getExcelColumnName(1);
        System.out.println( getExcelColumnName(52));
    }
}
