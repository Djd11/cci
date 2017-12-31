package stringsArrays;

public class zeromatrix {

   static boolean[]row,col;
    static void nullifyRows(int[][] m, int row) {

        for (int j = 0; j < m[row].length; j++) {
            m[row][j] = 0;
        }
    }

    static void nullifyCols(int[][] m, int col) {

        for (int i = 0; i < m.length; i++) {
            m[i][col] = 0;
        }
    }

    static void setZeros(int[][] m){

        //two boolean array to capture the row and col index

        row = new boolean[m[0].length];
        col = new boolean[m.length];

        for(int i =0;i<m[0].length;i++){
            for(int j = 0;j<m.length;j++){
                if(m[i][j]==0) {
                    row[i] = true;
                    col[j] = true;
                    System.out.println("Row :" + i + " Col :" + j + " index set as True");
                }
            }

        }

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

        int[][] m = {{1,0,3},{4,5,6},{7,8,9}};
        System.out.println("Origin matrix :");
        printMatrix(m);
        setZeros(m);
        for(int i = 0;i<m.length;i++){
            if(row[i])
                nullifyRows(m,i);
        }
        for(int j =0;j<m.length;j++){
            if(col[j])
                nullifyCols(m,j);
        }
        System.out.println("After setting Zeros :");
        printMatrix(m);
    }
}