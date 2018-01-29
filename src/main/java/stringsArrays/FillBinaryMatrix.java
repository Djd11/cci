package stringsArrays;
/*

   Fill bin martix with 1,0 for alternate rings of MXN matrix
 */
public class FillBinaryMatrix {

    /*

        two methods
        findvalue(int i,int j)
        based on index of i,j it will higher value of i,j
        processMatrix(a[][])
        it will process each index of i,j and call findvalue to set true or false
     */

    static int M=4,N=4; // size of matrix
    static int findValues(int i, int j){

        if(i> (M-i-1))
            i = M-i-1;
        if(j > N-j-1)
            j = N-j-1;

        return i < j ? i:j ;
    }

    static void processM(char binM[][]){

        for(int i =0;i<M;i++){

            for(int j =0;j<N;j++){

                binM[i][j] = (findValues(i,j) & 1)>0?'0':'1';

            }
        }
    }

    static void printM(char [][]a){

        for(int i = 0;i<M;i++){
            for(int j = 0; j<N;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][]a = new char[M][N];
        processM(a);
        printM(a);

    }

}
