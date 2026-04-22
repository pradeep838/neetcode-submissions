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
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode temp=head;
        ListNode root=null;
        while(temp!=null){
            if(root==null)
                root=new ListNode(temp.val);
            else{
                ListNode current=new ListNode(temp.val);
                current.next=root;
                root=current;
            }
            temp=temp.next;
        }
        return root;
    }
}
