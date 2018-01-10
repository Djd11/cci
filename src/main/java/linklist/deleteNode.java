package linklist;

public class deleteNode {

    // wrapper nested class of linklist and nodes

    static class LinkList{
        // it will have reference to what is the lastest node in the list
       static class Node {
            // it will have reference to next node
            Node next ;
            int data;

            Node(int data){

                this.data = data;

            }
        }

       static Node head;

        LinkList(){

            head = null;
        }

        static void insert(int data){

            Node newnode = new Node(data);
            newnode.next = head; // it will refer to next node which is head here
            head = newnode; // newnode becomes the latest member and will be the head
        }


       static Node deleteNode(Node head, int data){

            Node n = head;

            //check if the fisrt node which is head is the candidate for deletion
            if(n.data == data){
                return head.next;  // here moved the head itself to next as it the deletion match the fist node
            }

            // check from immediate next node is candidate for deletion and so forth
            // need a iterator to go over the list
            while(n.next!=null){

                if(n.next.data == data){
                    n.next = n.next.next;
                    return head; // here head did't moved
                }
                n = n.next;
            }

            return head;

        }

        static void printNodes(Node head){
            Node n = head;
            while(n!=null){
                System.out.print(n.data+" ");
                n = n.next;
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {


        for(int i = 0; i<=5;i++) {
            LinkList.insert(i);
        }
        System.out.println("Original list :");
        LinkList.printNodes(LinkList.head);
        LinkList.deleteNode(LinkList.head,2);
        System.out.println("Post delete list :");
        LinkList.printNodes(LinkList.head);
    }

}
