
// Problem: 234. Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur = slow;
        ListNode prev = null;
        ListNode next;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        ListNode left = head;
        ListNode right = prev;

        while(right!=null){
            if(left.val!=right.val) return false;
            right = right.next;
            left = left.next;
        }
        return true;
    }
}