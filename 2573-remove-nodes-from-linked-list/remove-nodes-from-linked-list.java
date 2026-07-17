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
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.val>temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return reverse(head);
    }
        public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        ListNode next1;
        while(cur!=null){
            next1=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next1;
        }
        return prev;
    }
}