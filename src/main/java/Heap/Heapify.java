package Heap;

public class Heapify {

    /*

        It can be implemented by arrays or vectors
        parent = (i-1)/2
        leftchild = 2*i +1
        rightchild = 2*i +2

        two mechanism for odering the heap structure
        minHeap parent <= A[i]
        maxHeap parent >= A[i]


        Two operations for altering the heap
        insert or push operation :

            Add it to end or right most node and heapify-up, ie swap it with parent based on
            min heap contraints.

        delete or pop operation :

            Pop the element from top [smallest [min heap] or highest [max heap] ] , last node comes at the top,
            run heapify-down to meet the heap [min or max] contraints

        Heapify-up

            swap(A[i],parents[i]) till smallest is at top for min heap constraint, this applies to push or insert operation.
            We recur the Heapify-up(Parent[i])

        Heapify-down

            swap(parent[i],leftchild[i] or rightchild[i]) which ever is larger in maxheap or smaller in case of min heap
            and recur same on Heapify-down(leftchild) for min heap heapify-down(rightchild) for max heap.


     */


//    static int max = 20;
    static int numberArray[]; //= new int[max];
    int lastIndexPostion = getSize();

    int getSize(){

        return numberArray.length -1 ;
    }

    void swapKey(int indexX , int indexY){

        int temp = 0;
        temp = numberArray[indexX];
        numberArray[indexX] = numberArray[indexY];
        numberArray[indexY] = temp;
    }
    int getParent(int index){

        if(index == 0)
            return 0;
        return (index - 1)/2;
    }

    int getLeftChild(int index){

        return (2*index + 1);
    }

    int getRightChild(int index){
        return (2 * index + 2);
    }


    /*
        insert into a min heap
     */
    void insert(int key){
        int currentindex = getSize();
        if(getSize()!=0 ){
            numberArray[currentindex] = key;
            heapifyUp(currentindex);

        }

    }

    void heapifyUp(int index){

        if(index==0)
            return;
        if(index >0 && numberArray[getParent(index)] < numberArray[index]){

            swapKey(getParent(index),index);
            heapifyUp(getParent(index));
        }

    }

    public static void main(String[] args) {
        int max = 3;
        numberArray = new int[max];

        Heapify heapify = new Heapify();

        heapify.insert(3);
        heapify.insert(2);
        heapify.insert(1);
        for(int i =0 ;i<numberArray.length;i++) {
            System.out.println(numberArray[i] +" ");
        }


    }
}
