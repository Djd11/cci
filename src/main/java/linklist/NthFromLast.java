package linklist;

public class NthFromLast {

    // Need a function to add element to the last of Linklist
    // main logic needs two pointer, FirstP,SecondP pointing to head
    // Move FPointer till n-1 node, first
    // Then move both the pointer till FirstPointer reaches null.
    // second pointer will give node



    public static class LinkListDemo {

        static DemoNode head;

        public static class DemoNode {

            DemoNode next;
            int data;

            DemoNode(int data){

                this.data = data;
            }
        }

        LinkListDemo(){

//            head = null;
        }

        // Insert at end of the list

        public static void insertAtEndOfList(DemoNode endNode){



            if(head == null){

                head = endNode;
            }else {
                DemoNode tmp = head;
                while(tmp.next != null){

                    tmp = tmp.next;
                }
                tmp.next = endNode;
            }

        }

        public static void printList(DemoNode head){

            DemoNode tmp = head;
            while(tmp !=null){
                System.out.print(+tmp.data+" ");
                tmp = tmp.next;
            }
            System.out.println();

        }


        // Take two pointer first and second
        // point both to head
        // move first pointer till n-1
        // move both pointer till first reaches the end
        // second pointer will have the

        public static DemoNode nthElementFromLast(DemoNode node, int nthPosition){


            if(node == null){
                return head;
            }
            DemoNode firstP = head, secondP= head;

            for(int i = 0;i<nthPosition;i++){

                firstP = firstP.next;
            }

            while (firstP!=null){

                firstP = firstP.next;
                secondP = secondP.next;
            }

            return secondP;
        }

    }

    public static void main(String[] args) {



        // creating a list
        LinkListDemo.DemoNode head = new LinkListDemo.DemoNode(5);
        LinkListDemo.insertAtEndOfList(head);
        LinkListDemo.insertAtEndOfList(new LinkListDemo.DemoNode(6));
        LinkListDemo.insertAtEndOfList(new LinkListDemo.DemoNode(7));
        LinkListDemo.insertAtEndOfList(new LinkListDemo.DemoNode(1));
        LinkListDemo.insertAtEndOfList(new LinkListDemo.DemoNode(2));
        LinkListDemo.printList(head);

        LinkListDemo.DemoNode nthFromLast = LinkListDemo.nthElementFromLast(head,3);
        System.out.println("3rd from last "+ nthFromLast.data);


    }

}
