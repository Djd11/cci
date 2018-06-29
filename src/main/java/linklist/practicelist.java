package linklist;

public class practicelist {

    static class LinkListNode{

        static ListNode head ;
        static class ListNode {

            ListNode next;
            int data;

            ListNode(int data){

                this.data = data;

            }
        }

        LinkListNode(){

            head = null;
        }

        static void insertNode(int data){

            ListNode newNode = new ListNode(data);
            newNode.next = head;
            head = newNode;
        }

        static ListNode deleteNode(ListNode head,int data){

            ListNode node = head;
            // check if first node has to be deleted , if data matches move the head itself ie return head.next

            if(node.data == data){
                return head.next;
            }
            // loop till end and when data matches return the temp.next to temp.next.next
            while(node!=null){

                if(node.next.data == data){

                    node.next = node.next.next;
                    return head;

                }
                node = node.next;

            }

           return head;

        }

        static void printlist(ListNode head){

            ListNode node = head;

            while(node!=null){

                System.out.print(" "+node.data );
                node = node.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        for(int i=0;i<5;i++){

            LinkListNode.insertNode(i);
        }

        LinkListNode.printlist(LinkListNode.head);
        LinkListNode.deleteNode(LinkListNode.head,2);
        LinkListNode.printlist(LinkListNode.head);
    }

}
