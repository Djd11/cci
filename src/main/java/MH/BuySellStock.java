package MH;

public class BuySellStock {

    /*

     Say you have an array for which the ith element is the price of a given stock on day i.

     If you were only permitted to complete at most one transaction (ie,
     buy one and sell one share of the stock), design an algorithm to find the maximum profit.

     Input: [7, 1, 5, 3, 6, 4]
    Output: 5
     */


    /*
       Approach
       Have 3 pointers Bought value = a[0],Sell value =0, Profit=0

       consider first element in the list as bought value
       compare the next element with the bought value
       if high , go for sell , update the sell value and difference as profit
       if less , go for buy , update the buy value,

       track the index for  max profit item.

     */

    static int maxProfit(int[] list){

        int res =0,buy=list[0],sell=0,profit=0,maxProfit =0;

        for(int i=1;i<list.length;i++) {

            if(buy>list[i]){
                buy = list[i];
                System.out.println("Bought at index " +i+" "+list[i]);
            }else{

                profit = list[i] - buy;
                sell = list[i];
                System.out.println("Sold at index " +i+" "+list[i]);

                if(maxProfit<profit) {
                    maxProfit = profit;
                    res = list[i];
                    System.out.println("Max profit at index " +maxProfit+" "+res);
                }
            }




        }


        return res;

    }

    public static void main(String[] args) {

        int[] list = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(list) + "is the max profit");
    }
}
