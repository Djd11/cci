package Easy.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum.sol1(new int[] {2,4,5,6},9);
    }

    static void sol1(int [] in,int tar){

        /*
            2,4,5,6
            9

           m(k,v)
           map(store diff,index)
           parse and check if item is present
           ex target is 9 = 4 + 5
           index 2 and 3 has the ans ie  4+5  and 5+4

           store Inputs 2,4,5,6 ---> (7,1) (5,2) (4,3) (3,4)





         */
        int[] ints = {};
        Map<Integer,Integer> m = new HashMap<Integer, Integer>();
        for (int i =0;i<in.length;i++){
            if(m.containsKey(in[i])){
                ints = new int[] {m.get(in[i]), i};
            }else {
                m.put(tar - in[i],i);
            }
        }
        for(int j=0;j<ints.length;j++) {
            System.out.println(ints[j]);
        }
    }
}
