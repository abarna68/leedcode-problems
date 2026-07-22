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
    public int numComponents(ListNode head, int[] nums) {
        ListNode temp=head;
        Set<Integer> has=new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            has.add(nums[i]);
        }
        while(temp!=null){ 
            if(has.contains(temp.val)&&(temp.next==null||!has.contains(temp.next.val))){
                sum=sum+1;
            }
            temp=temp.next;
        }
        return sum;
    }
}