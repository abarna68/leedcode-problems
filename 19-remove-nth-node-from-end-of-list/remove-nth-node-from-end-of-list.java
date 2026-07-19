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
        head=reverse(head);
        if(n==1){
            head=head.next;
        }
        else{
        ListNode temp=head;
        for(int i=1;i<n-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        }

        return reverse(head);
        }
        public ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode next1=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next1;
        }
        return prev;
        }
}