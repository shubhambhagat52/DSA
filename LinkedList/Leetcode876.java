// Problem: Middle of the Linked List
// Platform: LeetCode
// Time Complexity: O(n)
// Space Complexity: O(1)


// two pass algo
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


// single pass algo
// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution {
    public ListNode singlePassAlgo(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode middleNode(ListNode head) {
        return singlePassAlgo(head);
    }
}
  

