package MH;

public class MaxProductArray {

    /*

       given array of non zero size find the max product of contigiuous elements in the array


       define pointer max_product_so_far assign it to first element
       define point max_product ending here such that = a[i]*a[i+1]
       if maxendshere > maxprodSofar
            maxsofar = maxendshere
       if maxendshere is negative reset it.
     */

    static int maxProduct(int[] a){

        int maxProductsofar = a[0];
        int maxProductEndshere = 0;
        int size = a.length;
        int start=0,end=0,search=0;
        for(int i =0;i<size - 1;i++){

           maxProductEndshere = a[i]*a[i+1];
           if(maxProductEndshere > maxProductsofar){
               maxProductsofar = maxProductEndshere;
               start = search;
               end = i;
           }

           if(maxProductEndshere < 0){
               maxProductEndshere = 0;
               search = i+1;
               System.out.println("reset");
           }

        }
        return maxProductsofar;
    }


    public static void main(String[] args) {

        int[] a = {2,3,-2,4};
        System.out.println(maxProduct(a));
    }
}
