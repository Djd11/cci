package stringsArrays;

public class DiagonalMPrint {

    static void printDiagonalsM(int A[][]){

        /*

          k    00 01 02 03
          \    10 11 12 13
          |    20 21 22 23
               30 31 32 33

              k -->

            first block ie half upper part
            iterate over the rows 0 --> m-1, that too starting for first column
            as traversal moves upwards ,every traversal will go until first row

            second block is lower half
            iterate till end of column 0 --> n-1
            as traversal moves upward and every traversal ends at last column



         */
        int k,rowC = A.length,colC = A[0].length;
        // this will iterate till end of row
        for(k = 0;k<=rowC-1;k++){

            // it always starts from col 0 and moves upward till 0th row
            int j = 0;
            int i = k;
            while(i >=0){
                System.out.print(A[i][j+" ");
                i = i - 1;
                j = j + 1;

            }
        }
        System.out.println();
        // now print the lower half of matrix
        // as last ending  diagonal is already considered , so it starts from 2nd column.
        // it moves upwards till it ends at last column
        for(k =1;k<=colC-1;k++){

            int i = rowC-1;
            int j = k;
            while (j <= colC-1){
                System.out.print(A[i][j]+" ");
                i = i -1;
                j = j+1;
            }
        }

    }

    public static void main(String[] args) {

        int A[][] =
                {
                        {00 ,01, 02, 03},
                        {10, 11, 12, 13},
                        {20 ,21, 22, 23},
                        {30, 31, 32, 33}
                };
        // 00,10,01,20,11,02,30,21,12,03
        // 31,22,13,32,23,33
        printDiagonalsM(A);
    }
}
