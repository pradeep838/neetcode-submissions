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
    public void reorderList(ListNode head) {
        ListNode slowPointer=head;
        ListNode fastPointer=head.next;

        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }

        // from slow pointer points to mid of the list
        ListNode currentPointer=slowPointer.next;
      //  System.out.println(currentPointer.val);
        ListNode previousPointer=null;
        while(currentPointer!=null){
           
            ListNode temp=currentPointer.next;
            currentPointer.next=previousPointer;
            previousPointer=currentPointer;
            currentPointer=temp;
          
        }
         slowPointer.next=null;
        // System.out.println("test"+previousPointer.val);

        // tail is previousPointer
        

        ListNode current=head;

        while(previousPointer!=null){
            ListNode temp=current.next;
            ListNode prev=previousPointer.next;

            current.next=previousPointer;
            previousPointer.next=temp;

            current=temp;
            previousPointer=prev;
        }


    }
}
