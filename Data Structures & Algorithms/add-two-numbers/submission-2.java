/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lc1,lc2;
        ListNode resHead=null;
        lc1=l1;
        lc2=l2;
        ListNode previousNode=null;
        int carry=0;
        while(lc1!=null || lc2!=null){

            int currentValue=0;
            if(lc1!=null)
               currentValue+=lc1.val;
            if(lc2!=null)
                currentValue+=lc2.val;
            currentValue+=carry;

            carry=(currentValue/10);
            ListNode currentNode=new ListNode(currentValue%10);
            if(resHead==null) resHead=currentNode;
            if(previousNode!=null)
              previousNode.next=currentNode;
            previousNode=currentNode;
           if(lc1!=null)
              lc1=lc1.next;
            if(lc2!=null)
               lc2=lc2.next;
        }

     

        if(carry!=0)
        {
            ListNode currentNode=new ListNode(carry);
            previousNode.next=currentNode;
            previousNode=currentNode;
        }

        return resHead;
    }
}
