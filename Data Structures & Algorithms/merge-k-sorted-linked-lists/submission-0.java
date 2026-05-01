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
    public ListNode mergeKLists(ListNode[] lists) {
             PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>(
               
                new Comparator<ListNode>(){
                    public int compare(ListNode t1,ListNode t2){
                        return t1.val-t2.val;
                    }
                }
             );
          ListNode previousNode=null;
          ListNode currentNode=null;
          ListNode  head=null;

          for(int i=0;i<lists.length;i++){
            pq.add(lists[i]);
          }
          
          while(!pq.isEmpty()){
                currentNode=pq.poll();
                if(previousNode!=null)
                  previousNode.next=currentNode;
                if(head==null) {
                    head=currentNode;
    
                }
                if(currentNode.next!=null){
                    pq.add(currentNode.next);
                }
               previousNode=currentNode;
               currentNode=currentNode.next;
            }
          

          return head;
    }
}

