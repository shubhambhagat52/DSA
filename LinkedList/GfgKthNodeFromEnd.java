// Problem: Kth node from end
// Platform: GFG
// Time Complexity: O(n)
// Space Complexity: O(1)


/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

// single pass  algo



class Solution {
    public int getKthFromLast(Node head, int k) {
      
        int count=0;
        Node curr = head;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
          if(k<0 || k>count){
              return -1;
          }
          
          curr=head;
        
        for(int i=0;i<count-k;i++){
            curr=curr.next;
        }
        return curr.data;
        
    }
}