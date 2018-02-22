package TreesAndGraphs;

import java.util.Set;

public class BSTTree {

    /*
        Define node with left and right sub tree pointer
        insert function to add node either on left or right
        in-order traversal ie first left lsTree then rsTree

     */
    static class BSTNode {

        int data;
        BSTNode lsTree ;
        BSTNode rsTree ;

    }
     static class BST {



        BST() {

        }

        BSTNode createNewBstNode(int data){

            BSTNode bstNode = new BSTNode();
            bstNode.data = data;
            bstNode.lsTree = null;
            bstNode.rsTree = null;

            return bstNode;
        }
        BSTNode insert(BSTNode head,int data){

            if(head == null)
                return createNewBstNode(data);

            if(data < head.data)
                head.lsTree = insert(head.lsTree,data);
            else
                head.rsTree = insert(head.rsTree,data);

            return head;

        }
        void inorderT(BSTNode node){

            if(node == null)
                return;
            inorderT(node.lsTree);
            System.out.println(node.data+" ");
            inorderT(node.rsTree);

        }

        boolean findPair(BSTNode node,int sum,Set set){

            if (node == null)
                return false;
            if(findPair(node.lsTree,sum,set))
                return true;
            return true;


        }
    }

    public static void main(String[] args) {

        int[] keys = {23,40,20,50,15,0,3};
        BSTNode head = null;
        BST bst = new BST();
        for(int key : keys){

            head = bst.insert(head,key);

        }
        bst.inorderT(head);

    }
}
