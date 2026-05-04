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

    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode fastPointer=null;
        if(head.next!=null)
            fastPointer=head.next.next;
        ListNode slowPointer=head;
        boolean isCycle=false;
        while(fastPointer!=null && !isCycle){
                if(fastPointer.next!=null)
                    fastPointer=fastPointer.next.next;
                else
                   fastPointer=null;
                slowPointer=slowPointer.next;
                if(fastPointer==slowPointer) isCycle=true;
        }

        return isCycle;
    }
}
