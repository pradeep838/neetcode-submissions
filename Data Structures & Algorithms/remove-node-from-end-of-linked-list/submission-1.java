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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int totalNumberOfNodes=0;
       ListNode currentNode=head;
       while(currentNode!=null){
        totalNumberOfNodes++;
        currentNode=currentNode.next;
     }
     int nodeNumberToBeRemoved=totalNumberOfNodes-n;
    System.out.println(nodeNumberToBeRemoved);
     // find node
     currentNode=head;
     ListNode previousNode=null;
     while(nodeNumberToBeRemoved>0){
        previousNode=currentNode;
        currentNode=currentNode.next;
        nodeNumberToBeRemoved--;
     }
     if(previousNode!=null)
          previousNode.next=currentNode.next;
     else{
        head=currentNode.next;
     }
     return head;
    }
}
