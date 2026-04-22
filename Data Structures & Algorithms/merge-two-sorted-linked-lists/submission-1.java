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
        ListNode temp1,temp2,res=null,cp=res;
        temp1=list1;
        temp2=list2;
        int resval;
        while(temp1!=null && temp2!=null){
            if(temp1.val>temp2.val){
                resval=temp2.val;
                temp2=temp2.next;
            }else{
                resval=temp1.val;
                temp1=temp1.next;
            }
            if(res==null){
                res=new ListNode(resval);
                cp=res;
            }else{
                cp.next=new ListNode(resval);
                cp=cp.next;
            }
        }

         while(temp1!=null){
                resval=temp1.val;
                temp1=temp1.next;
            if(res==null){
                res=new ListNode(resval);
                cp=res;
            }else{
                cp.next=new ListNode(resval);
                cp=cp.next;
            }
        }

          while(temp2!=null){
                                            System.out.println("-----");

                resval=temp2.val;
                temp2=temp2.next;
            if(res==null){

                res=new ListNode(resval);
                cp=res;
            }else{

                cp.next=new ListNode(resval);
                cp=cp.next;
            }
        }

        return res;


    }
}