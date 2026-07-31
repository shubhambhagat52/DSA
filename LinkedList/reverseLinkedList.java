// approach 1 -> Data reversal
// Time Complexity: O(n^2)
// Space Complexity: O(1)


/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/




class Solution {
    Node getNodeAt (Node head,int idx){
        Node curr= head;
        for(int i=0;i<idx;i++){
             curr=curr.next; 
        }
          
        
        return curr;
    }
    
    Node swap(Node left , Node right){
        int temp = left.data;
        left.data = right.data;
        right.data = temp;
    }
    
    int size(Node head){
    int count = 0;
    Node curr = head;

    while(curr != null){
        count++;
        curr = curr.next;
    }

    return count;
}
    Node reverseList(Node head) {
        // code here
        int left=0;
        int right = size(head);
        
        while(left<right){
            Node leftnode= getNodeAt(left);
            Node rightnode = getNodeAt(right);
            swap(leftnode,rightnode);
            left++;
            right--;
        }
        
    }
}