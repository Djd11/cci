package stringsArrays;

public class Msort {

    /*
        Merge two unsorted array to a given array
        Merge(A,L,R)
        i <-- ll
        j <-- lr
        k <-- lA

        while(i< ll && j < lr){

         if(L[i] < R[i]){
            A[k] = L[i]
            i = i +1
         } else {

            A[k] = R[j]
            j = j+1
         }
         k = k +1

        }
        // Any left on either side of left or right
        while(i<ll){
            A[k] = L[i];
            i = i +1
            k = k+1
        }

        while (j < lr){

            A[k] = R[j]
            j = j +1
            k = k+1

        }
        recursively call Msort for left side and right side and then merge
        Msort(A)
            mid = n/2
            for i 0 to mid
            left <-- A[i]
            for mid to n
            right <-- A[i]
            Msort(left);
            Msort(right);
            Merge(A,left,right)


     */
}
