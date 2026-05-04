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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list1CurrentPointer=list1;
        ListNode list2CurrentPointer=list2;
        ListNode resultHeadNode=null;
        ListNode resultNodeCurrentPointer=null;
        ListNode resultPreviousNode=null;

        while(list1CurrentPointer!=null && list2CurrentPointer!=null){
           
           if(list1CurrentPointer.val>list2CurrentPointer.val){
                 resultNodeCurrentPointer=list2CurrentPointer;
                 list2CurrentPointer=list2CurrentPointer.next;
           }else{
                 resultNodeCurrentPointer=list1CurrentPointer;
                 list1CurrentPointer=list1CurrentPointer.next;
           }
           
           if(resultHeadNode==null){
             resultHeadNode=resultNodeCurrentPointer;
           }else{
               resultPreviousNode.next=resultNodeCurrentPointer;
           }
           resultPreviousNode=resultNodeCurrentPointer;
        }

        if(list2CurrentPointer!=null){
            if(resultHeadNode==null){
              resultHeadNode=list2CurrentPointer;
           }else{
              resultPreviousNode.next=list2CurrentPointer;
           }
        }

         if(list1CurrentPointer!=null){
            if(resultHeadNode==null){
              resultHeadNode=list1CurrentPointer;
           }else{
              resultPreviousNode.next=list1CurrentPointer;
           }
        }

        return   resultHeadNode;

    }
}