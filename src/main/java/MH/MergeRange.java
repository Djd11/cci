package MH;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class MergeRange {

/*
    given [1,3] ,[2,4] out put after merge [1,4]

    approach first sort the ranges
    start filling into a stack<pair> with below condition
    check last item with first item if there is a overlap i,e
    last > first , then replace the last with last of second pair.
 */

class  Pair<First,Last> implements Comparable{

    First first;
    Last last;
    Pair(First first,Last last){

        this.first = first;
        this.last = last;
    }

    First getFirst(){
        return first;
    }

    Last getLast(){
        return last;
    }
    void setFirst(First first){
        first = first;
    }
    void  setLast(Last last){

        last = last;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public void mergeRange(int[][] list){

    Stack<Pair> stackStore = new Stack<Pair>();
    ArrayList<Pair> pairlist = new ArrayList<Pair>();

    // Populate the Pair and add it to a list
    for(int i = 0; i<list.length;i++){

        for (int j = 0;j<list[0].length -1;j++){

            Pair<Integer,Integer> pair = new Pair(list[i][j],list[i][j+1]);
            System.out.print("["+pair.getFirst()+","+pair.getLast()+"]");
            pairlist.add(pair);
        }

    }
    System.out.println("");
    Collections.sort(pairlist);
    Pair previous = pairlist.get(0);
    stackStore.push(previous);
    for (int k = 0; k <pairlist.size();k++){
        Pair current = pairlist.get(k);

        // check if there is no overlap
        if((Integer)previous.getLast() <= (Integer)current.getFirst()){

            stackStore.push(current);
            previous = current;
        }else{
            // there is a overlap
            Pair merge = new Pair(previous.getFirst(),Math.max((Integer)current.getLast(),(Integer)previous.getLast()));
            stackStore.pop();
            stackStore.push(merge);
            previous = merge;
        }
    }
    System.out.printf("After merge");
    for(Pair p: stackStore){

        System.out.print("[" + p.getFirst()+","+p.getLast()+"]");
    }

}

    public static void main(String[] args) {
        MergeRange mergeRange = new MergeRange();
        int[][] list = {{1,3},{2,4},{3,8}};
        System.out.printf("Range");
        mergeRange.mergeRange(list);

    }
}
