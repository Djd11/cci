package stringsArrays;

public class SpiralPrintM {

    /*
    00 01 02 03
    10 11 12 13
    20 21 22 23
    30 31 32 33
     */
    static void printSpiral(int[][] A,int rowEI,int colEI){


        int k=0,l=0; // row start index,col start index

        while(k<rowEI && l<colEI) {

            for (int i = l; i <=colEI; i++) {

                System.out.print(A[k][i] + " ");

            }
            k++;


            for (int i = k; i <=rowEI; i++) {
                System.out.print(A[i][colEI] + " ");

            }
            colEI--;
            //when we converge towards column we have to check start row index less that row ending index
            if(k<rowEI) {
                for (int i = colEI; i >= l; i--) {

                    System.out.print(A[rowEI][i] + " ");
                }
                rowEI--;
            }
            if(l<colEI) {
                for (int i = rowEI; i >= k; i--) {
                    System.out.print(A[i][l] + " ");
                }
                l++;
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
        printSpiral(A,3,3);
        // 0,1,2,3,13,23,33,32,31,30,20,10,11,12,22,21
    }

}
