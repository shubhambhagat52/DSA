// Problem: 86. Partition List
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
    public ListNode partition(ListNode curr, int pivot) {
        ListNode ldummy = new ListNode(-1);
        ListNode rdummy = new ListNode(-1);
        ListNode left = ldummy, right = rdummy;
        while(curr!=null){
            if(curr.val<pivot){
                left.next= curr;
                left = left.next;
                curr=curr.next;
               
            }
            else{
                right.next = curr;
                right = right.next;
                curr=curr.next;
            }


            
        }
        left.next = rdummy.next;
        right.next = null;
        return ldummy.next;
        
        
    }
}
