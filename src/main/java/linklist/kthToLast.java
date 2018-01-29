package linklist;

import java.util.LinkedList;

public class kthToLast {

    /*
    Find kth to the last of SLL
     */





   static class LinkedListNode{

       LinkedListNode next ;
       int data;

       LinkedListNode(int data){
            this.data = data;
        }

       static int kthIndex(LinkedListNode head,int k){

           if(head == null) return 0;

           int index = kthIndex(head.next,k) + 1;
           if(index == k ){

               System.out.println(k + "th to the last index "+head.data);;
           }

           return index;
       }
    }

   static class LinkedList {

       LinkedListNode head;

       LinkedList(){

            head = null;
        }

       void insertNode(int data){

            LinkedListNode newnode = new LinkedListNode(data);
            // this has to be linked with previious node, here it is the head node
            newnode.next = head;
            head = newnode;

       }
    }




    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        // insert 5 element
        for(int i = 1;i<=5;i++)
            linkedList.insertNode(i);
        LinkedListNode.kthIndex(linkedList.head,4);
    }
}
