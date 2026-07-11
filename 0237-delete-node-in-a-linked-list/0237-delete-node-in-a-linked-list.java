/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public void deleteNode(ListNode node) {
        //we will insert 1 at the place of 5 
        node.val=node.next.val;
        //we will connect the node to the nod.next(1).next->9
        node.next=node.next.next;
    }
}