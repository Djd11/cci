package MH;

public class FindMinInRotatedSortedArray {

    /*

        Min element is lesser than previous element.
        If there is no previous element that means array is not rotated

        we apply this pattern for checking if mid  or mid +1 is smmallest

        if either of them is not smallest , we have to search in left half or right half recursively

     */


    static int minElementInRotatedArray(int[]a, int firstIndex, int lastIndex){

        int midIndex = (firstIndex + lastIndex)/2;
        // check if array has only one element

        if(firstIndex == lastIndex){

            return a[firstIndex];
        }

        // check if mid + 1 is the smallest element

        if(midIndex < lastIndex && a[midIndex] > a[midIndex +1]){

            return a[midIndex + 1];

        }

        // check if mid itself is smallest element

        if(midIndex > firstIndex && a[midIndex] < a[midIndex - 1]){

            return a[midIndex];
        }

        // Decide whether to go to left or right

          // if a[mid] < a[lastindex]

            // search in left half
            // findmin(a[],firstIndex,mid-1)

        // else
         //  search in right half
        // findmin(a[],mid+1,lastIndex)


        if (a[lastIndex] > a[midIndex]){

           return minElementInRotatedArray(a,firstIndex,midIndex-1);

        } else
           return minElementInRotatedArray(a,midIndex+1,lastIndex);



    }

    public static void main(String[] args) {

        int a[] = {5,6,1,2,3,4};
        System.out.println("Smallest element "+ minElementInRotatedArray(a,0,5));
    }
}
