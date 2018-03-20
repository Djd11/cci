package MH;

public class ProductArray {

    /*

       given a array 1,2,3 find the product such that ith element is not counted in that product value

       1,2,3 --> 6,3,2

       two approaches
       order of n solution with extra space
       take two arrays left and right
       assign 1 to first element in left , last element in right.
       start constructing the left

            fill the left begining from 2nd postion onwards
                for i = 1 to n
                left[i] = a[i-1] * left[i-1]

       start constructing the right begining from first till n-2
            fill the right
            for j = n - 2 to 0
            right[j] = a[j+1] * right[j+1]

        finally product[i] = left[i] * right[i]


        order of n with constant memory
        Use log method

        x = a*b*c
        logx = loga + logb + logc

        x = antilog (loga + logb + logc)

     */

    static int[] productArray(int a[]){

        int[] left = new int[a.length];
        int[] right = new int[a.length];
        int[] product = new int[a.length];

        int i=0,j=0;
        int size = a.length;

        left[0]=1;
        right[size-1]=1;

        //construct left array
        for(i = 1;i<size;i++){

            left[i]= a[i-1]*left[i-1];
        }

        //construct right array
        for(j = size - 2;j>=0;j--){

            right[j]= a[j+1]*right[j+1];
        }

        for(int k = 0;k<size;k++){

            product[k] = left[k]*right[k];
        }
        return product;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] res = productArray(a);
        for(int i =0;i<a.length;i++){
            System.out.print(res[i]+ " ");
        }
    }
}
