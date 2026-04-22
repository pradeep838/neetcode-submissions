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
        if(list1==null) return list2;
        else if(list2==null) return list1;
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

        if(temp1!=null){
            cp.next=temp1;
        }else{
            cp.next=temp2;
        }

                return res;

        }



    }
