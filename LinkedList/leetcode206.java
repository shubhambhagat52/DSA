
// Problem: Reverse singly linkedlist
// Platform: LeetCode
// Time Complexity: O(n)
// Space Complexity: O(1)


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
    public ListNode reverseList(ListNode head) {
        ListNode prev= null, curr= head;
        while(curr!=null){
            ListNode ahead= curr.next;
            curr.next = prev;
            prev= curr;
            curr = ahead;

        }
        return prev;
    }
}