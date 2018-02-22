package MH;

public class UnionIntersectionSortedArray {

    /*

        a = {1,4,6,7,8}
        b = {7,10,12}


        Have two pointers i,j
        start from first element of each array
        compare a[i] with a[j]
            if equal
                append it to a intersection stringbuffer
                Also add it to union stringbuffer
                increatment both i an j pointer
            if a[i] < a[j]
                append a[i] to union
                move i pointer to next
            else
                appen a[j] to union
                move j pointer to next

            in case both arrays are not same
                push remaining elements to union
                increment i and j

     */

    public static void main(String[] args) {
        int[]a = {1,4,6,7,8};
        int[]b = {7,10,12};
        unionAndIntersection(a,b);
        // union {1,4,6,7,8,10,12}
        //intersection {7}
    }

    static void unionAndIntersection(int[]a,int[]b){

        StringBuilder union = new StringBuilder(),intersection = new StringBuilder();
        int i=0,j=0,asize = a.length-1,bsize=b.length-1;

         if(asize <0 || bsize<0){
            throw new IllegalArgumentException("Array seems empty");
         }
        while(i < asize && j < bsize){

            if(a[i] == b[j]){
                intersection.append(a[i]);
                intersection.append(" ");
                union.append(a[i]);
                union.append(" ");
                i++;j++;
            }
            if(a[i] < b[j]){

                union.append(a[i]);
                union.append(" ");
                i++;
            }else {
                union.append(b[j]);
                union.append(" ");
                j++;
            }
        }

        while(i<asize){

            union.append(a[i]);
            union.append(" ");
            i++;
        }

        while (j<bsize){
            union.append(b[j]);
            union.append(" ");
            j++;
        }
        System.out.println("Union "+union.toString());
        System.out.println("Intersection "+intersection.toString());
    }
}
