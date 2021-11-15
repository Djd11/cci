package Medium.LinkedList;
class ListNode
{
  int val;
  ListNode next;

  ListNode (int val)
  {
    this.val = val;
  }
}

public class AddNumbers
{
  public static void main (String[]args)
  {
    ListNode node1 = new ListNode (9);
      node1.next = new ListNode (9);
      node1.next.next = new ListNode (9);
    ListNode node2 = new ListNode (9);
      node2.next = new ListNode (9);
      ListNode sum = AddNumbers.addNumber (node1, node2);
      while(sum!=null){
        System.out.println(sum.val+" -> ");
        sum = sum.next;
      }
  }


  static ListNode addNumber (ListNode l1, ListNode l2)
  {

     /*
             carry : div by 10 will give carry ie the quotient
            sum digit which needs be kept : mod by 10 remainder will give the sum digit which needs to be kept.
            At the end if carry is > 1 : a new node which will be the carry value and next pointer points to these new carry node.
            96 + 47 : 143
            Linked list is in reversed way

           ex : 69 + 74 : 341
           traverse back you get the answer 143
           first digit s = 6 + 7 - 13 ; 1 is carry s is 3 ans node 0's next points to  3
           second digit s = 9 + 4 + 1 - 14 ; 1 is carry, s is 4 ; 3 points to 4
           now as the link list ended and still it has a carry value > 0 , it needs to be placed right next to sum digit node
           ans : 0 - 3 - 4 - 1

           Edge case
           if length of inputs are not same
           no need to calculate the length before hand as while loop is OR condition so it will allow to pass different length link list
           so while iterating over the list have a null check as that node would be point to null if shorter in length.
           add 0 to non existing values trick : int x = (l1!null) ? l1.val :0
         */

    ListNode p1 = l1, p2 = l2;
    ListNode tmp = new ListNode (0);
    ListNode ans;
    ans = tmp;
    /* Need to have a pointer to head of linkedlist which can be used at the end, the next node will have the sta
     starting of answer to the solution.
    */

    int carry = 0;

    while (p1 != null || p2 != null)
      {

        int sum;
        int t1 = (p1!=null)?p1.val:0;
        int t2 = (p2!=null)?p2.val:0;
        sum = t1 + t2 + carry;
        carry = sum / 10;
        sum = sum % 10;

        tmp.next = new ListNode (sum);
        tmp = tmp.next;

        if(p1!=null) p1 = p1.next;
        if(p2!=null) p2 = p2.next;
        System.out.println ("sum " + sum + " carry " + carry + " ans "+tmp.val);

      }

    if(carry > 0){
      tmp.next = new ListNode(carry);
    }

    return ans.next;
  }
}

