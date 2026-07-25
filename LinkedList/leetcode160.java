
// Problem: Intersection of 2 LinkedList
// Platform: LeetCode
// Time Complexity: O(n)
// Space Complexity: O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int size(ListNode curr) {
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = size(headA);
        int sizeB = size(headB);

        ListNode currA = headA, currB = headB;
        for (int i = 0; i < (sizeA - sizeB); i++) {
            currA = currA.next;
        }
        for (int i = 0; i < (sizeB - sizeA); i++) {
            currB = currB.next;
        }

        while (currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }
        return currA;

    }
}