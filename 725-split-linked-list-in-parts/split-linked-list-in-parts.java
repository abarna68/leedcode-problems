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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
           count++;
           temp=temp.next;
        }  
        int size=count/k;
        int extra=count%k;
        temp=head;
        ListNode[] num=new ListNode[k];
         for(int i=0;i<k;i++){
            num[i]=temp;
            int cs=size;
            if(extra>0){
                cs=cs+1;
                extra=extra-1;
            }
             for(int j=1;j<cs;j++){
                if(temp!=null){
                temp=temp.next;
                }
             }
             if(temp!=null){
                ListNode curr=temp.next;
                temp.next=null;
                temp=curr;
             }
         }
         return num;
    }
}