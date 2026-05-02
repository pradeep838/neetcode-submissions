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
        while(lc1!=null && lc2!=null){
            int currentValue=lc1.val+lc2.val+carry;
            carry=(currentValue/10);

            ListNode currentNode=new ListNode(currentValue%10);
            if(resHead==null) resHead=currentNode;
            if(previousNode!=null)
            previousNode.next=currentNode;
            previousNode=currentNode;
            lc1=lc1.next;
            lc2=lc2.next;
        }

        while(lc1!=null){
            int currentValue=lc1.val+carry;
            carry=(currentValue/10);
            ListNode currentNode=new ListNode(currentValue%10);
            if(resHead==null) resHead=currentNode;
            if(previousNode!=null)
            previousNode.next=currentNode;
            previousNode=currentNode;
            lc1=lc1.next;
        }

         while(lc2!=null){
            int currentValue=lc2.val+carry;
            carry=(currentValue/10);
            ListNode currentNode=new ListNode(currentValue%10);
            if(resHead==null) resHead=currentNode;
            if(previousNode!=null)
            previousNode.next=currentNode;
            previousNode=currentNode;
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
