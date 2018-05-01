package MH;

import java.util.*;

public class NonOverlapInterval {

    /*
            Find no of overlapping interval on a given list
            [1,2],[1,3] return 1 overlap
            [1,2],[2,3],[4,6] return 0 overlap

     */

    class Pair<First,Last> implements Comparable {

        First first;
        Last last;

        Pair(First first, Last last){

            this.first = first;
            this.last = last;

        }

        First getFirst(){

            return first;
        }

        Last getLast(){

            return last;
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }



    ArrayList<Pair> getPairs(int[][] list){

        ArrayList<Pair> pairs = new ArrayList<Pair>();
        for(int i =0 ;i<list.length;i++){
            for(int j =0;j<list[0].length -1;j++){
                Pair<Integer,Integer> pair = new Pair(list[i][j],list[i][j+1]);
                pairs.add(pair);
            }
        }
        return pairs;
    }

    public int findNumberOfOverlap(int [][] list){

        int count = 0;
        ArrayList<Pair> pairs = getPairs(list);

        if(pairs.size() == 0){

            return count;

        }

        Pair previous = pairs.get(0);

        for(int k = 0;k<pairs.size() -1;k++){

            Pair current = pairs.get(k);
            //check overlap
            if((Integer)previous.getLast() > (Integer) current.getFirst()){

                // no overlap continue

                previous = current;
                count++;

            } else {

                previous = current;
            }

        }

        return count;

    }

    public static void main(String[] args) {

        int[][] list = {{1,2},{1,3}};

        NonOverlapInterval nonOverlapInterval = new NonOverlapInterval();
        System.out.println( "Number of overlapping range found "+nonOverlapInterval.findNumberOfOverlap(list));
    }
}
