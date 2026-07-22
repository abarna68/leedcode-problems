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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp=head;
        ListNode dummy=new ListNode(-1);
        while(temp!=null){
             ListNode next1=temp.next;
             ListNode cur=dummy;
              while(cur.next!=null&&cur.next.val<temp.val){
                   cur=cur.next;
              }
              temp.next=cur.next;
              cur.next=temp;
              temp=next1;
            }
        return dummy.next;
    }
}