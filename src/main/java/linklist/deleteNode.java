package linklist;


public class deleteNode {

    // wrapper nested class of linklist and nodes

    static class LinkList {
        // it will have reference to what is the lastest node in the list
        static class Node {
            // it will have reference to next node
            Node next;
            int data;

            Node(int data) {

                this.data = data;

            }
        }

        static Node head;

        LinkList() {

            head = null;
        }

        static void insert(int data) {

            Node newnode = new Node(data);
            newnode.next = head; // it will refer to next node which is head here
            head = newnode; // newnode becomes the latest member and will be the head
        }


        static Node deleteNode(Node head, int data) {

            Node n = head;

            //check if the fisrt node which is head is the candidate for deletion
            if (n.data == data) {
                return head.next;  // here moved the head itself to next as it the deletion match the fist node
            }

            // check from immediate next node is candidate for deletion and so forth
            // need a iterator to go over the list
            while (n.next != null) {

                if (n.next.data == data) {
                    n.next = n.next.next;
                    return head; // here head did't moved
                }
                n = n.next;
            }

            return head;

        }

        static void printNodes(Node head) {
            Node n = head;
            while (n != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
            System.out.println();
        }


        public static LinkList.Node seperateEvenAndOdd(LinkList.Node head) {


            // we will need four pointers

            LinkList.Node oddHead = null, oddLast = null, evenHead = null, evenLast = null, current;

            // return head if only one element present
            if (head == null || head.next == null) {

                return head;
            }

            current = head;
            while (current != null) {
                // if element is odd
                if (current.data % 2 != 0) {

                    if (oddHead == null) {

                        oddHead = oddLast = current;

                    } else {

                        oddLast.next = current;
                        oddLast = current;
                    }
                } else {

                    if (evenHead == null) {

                        evenHead = evenLast = current;

                    } else {

                        evenLast.next = current;
                        evenLast = current;
                    }
                }
                current = current.next;
            }

            // At the end head become eventhead ,evenLast become oddhead and oddHead.next becomes null
            if (evenHead != null) {

                head = evenHead;
                if (oddHead != null) {
                    evenLast.next = oddHead;
                }

                oddLast.next = null;
            }

            return head;

        }

        public static boolean hasCycle(LinkList.Node head){


            // will work with fast and slow pointer and iterate over the list
            // if both the pointer value are same there is a cycle present

            LinkList.Node fast = head,slow =head;

            while(fast != null && fast.next != null ){

                fast = fast.next.next;
                slow = slow.next;


                if(fast == slow) {
                    System.out.println("Cycle at value "+fast.data );
                    return true;
                }

            }

            return false;
        }


        public static LinkList.Node reverseList(LinkList.Node head){

            // Have 3 pointers current, previous, next
            // At begining previous points to null
            // Before breaking the link pointing current to previous , hold the next pointer reference of current link to next
            // ie first establish the next which is current.next
            // move previous to current and current to next as iteration progress till the end


            LinkList.Node prev=null,curr=head,next;
            while (curr!=null){

                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;

            }


            return prev;

        }

        public static LinkList.Node reversePari(LinkList.Node head){

            LinkList.Node prev =head, newhead =null,next,tmp1,tmp2;

            while (prev!=null ) {

                next = prev.next;
                tmp1 = next.next;
                tmp2 = tmp1.next;
                next.next = prev;
                prev = next;
                next = tmp2;
                prev = tmp1;


            }
            return prev;
        }
    }
    public static void main(String[] args) {


        for(int i = 0; i<=5;i++) {
            LinkList.insert(i);
        }
        System.out.println("Original list :");
        LinkList.printNodes(LinkList.head);
////        LinkList.deleteNode(LinkList.head,2);
////        System.out.println("Post delete list :");
////        LinkList.printNodes(LinkList.head);
//        LinkList.Node tmp = LinkList.seperateEvenAndOdd(LinkList.head);

//        LinkList.printNodes(tmp);
//        LinkList.Node tmp = LinkList.reverseList(LinkList.head);
        LinkList.Node tmp = LinkList.reversePari(LinkList.head);
        LinkList.printNodes(tmp);

    }

}
