package MH;

import java.util.HashMap;

public class TwoSum {

    /*

      given numbers 2,4,5,1 return the index's when target sum is reached.

      brute force of parsing the loop will be n square

      optimise one would use extra memnory and reduce the TC in order of O(n)

      Take a Hashmap while inserting element into a HM also check for the key such that key == target - a[index], that is
      another way of saying key + a[i] = target

      signature of method

      int[] twoSum(int[] a, target){}

     */


    public static int[] twoSum(int[] a,int target){

        HashMap<Integer,Integer> hStore = new HashMap<Integer, Integer>();
        int diff =0;
        for(int i =0 ;i<a.length;i++){

            diff = target - a[i];
            if(hStore.containsKey(diff)){

                System.out.println(target + " seen at indexs "+i+ " "+hStore.get(diff));
                return new int[] {i,hStore.get(diff)};
            }
            hStore.put(a[i],i);
        }

        throw new IllegalArgumentException("No sum found");
    }

    public static void main(String[] args) {

        int[] a = {2,4,5,1};
        int targetSum = 9;
        twoSum(a,targetSum);
    }
}
