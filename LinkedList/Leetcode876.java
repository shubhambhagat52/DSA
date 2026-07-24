// Problem: Middle of the Linked List
// Platform: LeetCode
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode twoPassAlgo(ListNode head){
        ListNode curr = head;
        int count=0;
        while(curr!=null){
            curr=curr.next;
            count++ ;
        }
        curr=head;

        for(int i=0;i<count/2;i++){
            curr=curr.next;
             
        }
      return curr;
    }
    public ListNode middleNode(ListNode head) {
        return twoPassAlgo(head);
        
    }
}