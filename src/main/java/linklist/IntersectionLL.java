package linklist;

public class IntersectionLL {

    /*
    find the length of two ll
    find the diff of length
    move the head pointer of longer ll by diff, move the head pointer of small by one
    break if the head of each is equal and print the node.
     */
    

     static class Linklist{

         Node head;

         class Node{

            Node next;
            int data;
            Node(int data){
                this.data = data;
            }
        }

        Linklist(){
            head = null;
        }

         Node insert (int data){

            Node newnode = new Node(data);
            newnode.next = head;
            head = newnode;

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

    static int findLength(Linklist.Node head){

        if (head==null) return 0;
        Linklist.Node tmp = head;
        int length = 0;
        while (tmp.next!=null){
            length++;
            tmp = tmp.next;
        }
        System.out.println("List count : "+length);
        return length;
    }

    static Linklist.Node findIntersectingNode(Linklist.Node one, Linklist.Node two){

        if(one==null || two==null) return null;
        int l1 = findLength(one),l2 = findLength(two),diff = 0;
        Linklist.Node p1=one,p2=two;
        if(l1>l2){
            int i =0;
            diff = l1 -l2;
            while(i<diff){
                p1 = p1.next;
                i++;
            }
        }else {
            int i =0;
            diff = l2 -l1;
            while(i<diff){
                p2 = p2.next;
                i++;
            }
        }

        while(p1!=null || p2!=null){

            if(p1.data == p2.data) {
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        if(p1==null){

            Linklist empty = new Linklist();
            empty.insert(-1);
            return empty.head;
        }

        return p1;
    }
    public static void main(String[] args) {

        Linklist l1 = new Linklist();
        Linklist l2 = new Linklist();

        l1.insert(3);
        l1.insert(2);
        l1.insert(1);
        l2.insert(2);
        l2.insert(3);
        System.out.println("List one ");
        Linklist.printNodes(l1.head);
        System.out.println("List two ");
        Linklist.printNodes(l2.head);
        System.out.println("Intersection found at "+
        findIntersectingNode(l1.head,l2.head).data);

    }

}
