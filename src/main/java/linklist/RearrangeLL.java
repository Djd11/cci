package linklist;

public class RearrangeLL {

    /*
    a1,a2,b1,b1
    a1,b1,a2,b2
     */


   static class LiskList{

        static Node head;
        static class Node{

            Node next;
            String data;
            Node(String data){
                this.data = data;
            }
        }

        LiskList(){

            head = null;
        }

        static void insert(String data){

            Node newnode = new Node(data);
            newnode.next = head;
            head = newnode;

        }

        static void printNode(Node head){
            Node s = head;
            while(s!=null){
                System.out.print(s.data+" ");
                s = s.next;
            }
            System.out.println();
        }


        /*
        Let n = 2. We are starting with a list:

            a1 -> a2 -> b1 -> b2
            Let p1 be a "fast" pointer initially pointing to the successor of head.
            Let p2 be a "slow" pointer initially pointing to the head.

                  p1
            a1 -> a2 -> b1 -> b2
            p2
            We move p1 by two and p2 by one until p1 reaches the end of the list (there is no next).

                              p1
            a1 -> a2 -> b1 -> b2
                  p2
            Move p1 back to the head.

            p1
            a1 -> a2 -> b1 -> b2
                  p2
            Advance p2.

            p1
            a1 -> a2 -> b1 -> b2
                        p2
            "Weaving" starts.

            Take element pointed by p2 and move it after p1. Advance p1 after inserted element.

                        p1
            a1 -> b1 -> a2 -> b2
                              p2
            Take element pointed by p2 and move it after p1. Advance p1 after inserted element.

                                   p1
            a1 -> b1 -> a2 -> b2
                              p2
            p1 is null, terminate.
         */
        static Node rearrange(Node head){
            Node fast = head.next,
                    slow= head;
            while(fast.next!=null){


                fast = fast.next.next;
                slow = slow.next;
            }


            fast = head;
            slow = slow.next;
           while(slow.next!=null){
                Node tmp = slow;
                fast.next = slow;
                slow = tmp.next;

            }

            return head;
        }
    }

    public static void main(String[] args) {
//        LiskList.insert("b3");
        LiskList.insert("b2");
        LiskList.insert("b1");
//        LiskList.insert("a3");
        LiskList.insert("a2");
        LiskList.insert("a1");

        System.out.println("Original list :");
        LiskList.printNode(LiskList.head);
        LiskList.rearrange(LiskList.head);
        System.out.println("After rearrange :");
        LiskList.printNode(LiskList.head);


    }
}
