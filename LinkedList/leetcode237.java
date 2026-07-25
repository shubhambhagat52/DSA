// Problem: 237. Delete Node in a Linked List
// Platform: LeetCode
// Time Complexity: O(1)
// Space Complexity: O(1)


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public void swap(ListNode node) {
        int temp = node.val;
        node.val = node.next.val;
        node.next.val = temp;
    }

    public void deleteNode(ListNode node) {

        swap(node);
        node.next = node.next.next;
    }
}