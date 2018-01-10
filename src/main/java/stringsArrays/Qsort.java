package stringsArrays;

public class Qsort {

    /*
    Qsort(Array a,start,end){

    partiion(A,start,end);
    Qsort(start,pIndex-1);
    Qsort(pIndex,end);
    }

    swap(A[i],A[j] )
     */

    static void swap(int a,int b){

        int tmp = 0;
        if(a!=b) {
            tmp = a;
            a = b;
            b = tmp;
        }
    }

    /*
    Partition the array such that element left of partion index is towards left and vice versa
     */

    static int partionIndex(int[]A,int start,int end){

        /*
        select pivot at last element
        select partition index at fisrt
        compare A[i] with pivot, if less , swap with pIndex
         */

        int lengthArray = A.length;
        int pIndex = start;
        int pivot = A[end];

        if(lengthArray < 2)
            return 0;
        for(int i =0 ; i<lengthArray-1;i++){

            if(A[i] <= pivot){
                swap(A[i],A[pIndex]);
                pIndex++;
            }

        }
        swap(A[pIndex],A[end]);
        return pIndex;
    }

    static void qS(int[] A,int start,int end){

        while(start <= end){

            int partionIndex = partionIndex(A,start,end);
            qS(A,start,partionIndex-1);
            qS(A,partionIndex+1,end);

        }

    }

    public static void main(String[] args) {

        int[]A = {1,3,2,4};
        qS(A,0,3);
        for(int i = 0;i<A.length;i++) {
            System.out.print(A[i] + " ");
        }
    }
}
