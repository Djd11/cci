package linklist;

public class RemoveDups {

    /*
    Remove duplicate from unsorted Link list

    A -> B -> B -> C To  A -> B -> C
     */

    static class Node{


        // will have reference of next node

        Node next;
        String data;
        Node(String data){
            this.data = data;
        }

        void display(){
            System.out.println("BSTNode :"+data);
        }


        String stringtoString(){

            return data;
        }

        static void  removeDup(Node head){

            // work with two pointers current and runner
            Node current = head;

            // two while loop 0(N squre)

            while(current != null){
                Node runner = current;
                    while (runner.next !=null){

                        if(runner.next.data == current.data){
                            runner.next = runner.next.next;
                        }else {
                            runner = runner.next;
                        }
                    }
                current = current.next;

            }

        }
    }

    static class LinkedList {

        // will have reference of latest node in it, basically a placeholder for all the nodes under it

       Node firstnode;

       LinkedList(){
           firstnode = null;
       }

       boolean isEmpty(){

           return (firstnode == null);
       }

       // insert a new firstnode
        // you will pass what needs to be inserted, here in this case it is a string
        void insert(String s){
            Node newnode = new Node(s);
           // then as it has to be linked with it previous link , which is the first link here
            newnode.next = firstnode;
            firstnode = newnode;
        }

        void display(){

            Node node1 = firstnode;
            while (node1!=null){
                node1.display();
                if(node1.next!=null)
                    System.out.print("Next BSTNode  : "+node1.next.stringtoString());
                else
                    System.out.println("Reached End");
                node1 = node1.next;
                System.out.println();
            }
        }
        void printList(Node head){

            Node s = head;
            while(s!=null){
                System.out.print(s.data+" ");
                s = s.next;
            }
            System.out.println();
        }



    }



    public static void main(String[] args) {

        LinkedList node = new LinkedList();
        node.insert("A");
        node.insert("A");
        node.insert("B");
        node.insert("1");
        node.insert("2");
        System.out.println("Original list :");
        node.printList(node.firstnode);
        Node.removeDup(node.firstnode);
        System.out.println("After removing dups :");
        node.printList(node.firstnode);





    }
}
