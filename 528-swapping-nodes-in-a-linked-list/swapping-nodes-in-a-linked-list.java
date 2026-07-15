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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode cur=head;
        for(int i=1;i<k;i++){
            cur=cur.next;
        }
        ListNode s=head;
        ListNode f=cur;
        while(f.next!=null){
             s=s.next;
             f=f.next;
        }
        int temp=cur.val;
        cur.val=s.val;
        s.val=temp;
        return head;
    }
}