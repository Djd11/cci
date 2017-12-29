package stringsArrays;

public class matixManupulation {

    static int[][] swaprows(int [][]m){

        if(m.length == m[0].length) {
            int i, j;

            for (i = 0, j = m.length - 1; i < j; ++i, j--) {

                int[] t = m[i];
                m[i] = m[j];
                m[j] = t;
            }
        }
        else {
            System.out.println("Matrix is not nxn");
        }
        System.out.println("Swap rows :");
        printMatrix(m);
        return m;
    }

    static int[][] tranpose(int[][] m){
        int[][] temp = new int[m[0].length][m.length];
        if(m.length == m[0].length){

            for(int i= 0;i<=m.length-1;i++){
                for(int j =0;j<=m[0].length-1;j++){
                    temp[j][i]=m[i][j];
                }
            }

        } else {
            System.out.println("Matrix is not nxn");
        }
        System.out.println("Transpose :");
        printMatrix(temp);
        return temp;
    }

    static int[][] rotateNinty(int[][]m){


       int[][] transpose = tranpose(m);
       int[][] swaprows = swaprows(transpose);

       return swaprows;
    }

    static void printMatrix(int[][] m){

        for(int i = 0;i<=m.length-1;i++){
            for(int j = 0;j<=m.length-1;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] s = {{1,2,3}
                   ,{4,5,6}
                    ,{7,8,9}};
//        int[][] s = {{1,2}
//                     ,{3,4}};

        System.out.println("Origin Matrix ");
        printMatrix(s);
        int[][] ninetydegree = rotateNinty(s);
        System.out.println("90 Degree :");
        printMatrix(ninetydegree);
    }
}
